package com.shawnrebello.baritsu.src;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import com.shawnrebello.baritsu.antlr.*;
import com.shawnrebello.baritsu.lib.*;
import java.io.FileInputStream;
import java.io.InputStream;


public class Compiler {
  public static void main (String[] args) throws Exception {
    String inputFile = null;
    if ( args.length>0 ) inputFile = args[0];
    InputStream is = System.in;
    if ( inputFile!=null ) is = new FileInputStream(inputFile);
    ANTLRInputStream input = new ANTLRInputStream(System.in);
    BaritsuLexer lexer = new BaritsuLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    BaritsuParser parser = new BaritsuParser(tokens);
    ParseTree tree = parser.program();
    System.out.println(tree.toStringTree(parser));
    ParseTreeWalker walker = new ParseTreeWalker();
    EvalListener eval = new EvalListener(parser);
    walker.walk(eval, tree);
  }
}