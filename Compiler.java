import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Compiler {
  public static void main (String[] args) throws Exception {

    ANTLRInputStream input = new ANTLRInputStream(System.in);
    BaritsuLexer lexer = new BaritsuLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    BaritsuParser parser = new BaritsuParser(tokens);
    ParseTree tree = parser.program();
    System.out.println(tree.toStringTree(parser));
  }
}