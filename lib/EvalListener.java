package com.shawnrebello.baritsu.lib;

import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import com.shawnrebello.baritsu.antlr.*;


public class EvalListener extends BaritsuBaseListener {
  BaritsuParser parser;
  Map <String, Value> variables = new HashMap<String, Value>();
  public EvalListener(BaritsuParser parser) {
    this.parser = parser;
  }

  @Override
  public void enterProgram(BaritsuParser.ProgramContext ctx) {
   }

   public void exitProgram(BaritsuParser.ProgramContext ctx) {
   }

   @Override
   public void enterVariable_declaration(BaritsuParser.Variable_declarationContext ctx) {
    String variableName = ctx.ID().getText();
    // // Adding variable to map
    if (ctx.statement() != null) {
      String value = ctx.statement().getText();

    if ( ctx.statement().primitive() != null) {
      if( ctx.statement().primitive().INT() != null ) {
          Value intValue = new Value("INTEGER", Integer.parseInt(value));
          variables.put(variableName, intValue);
      }
      else if( ctx.statement().primitive().BOOLEAN() != null ) {
        Value boolValue = new Value("BOOLEAN", Boolean.parseBoolean(value));
        variables.put(variableName, boolValue);
      }
      else if( ctx.statement().primitive().STRING() != null ) {
        Value boolValue = new Value("BOOLEAN", Boolean.parseBoolean(value));
        variables.put(variableName, boolValue);
      }
      else {
        Value undefinedValue = new Value();
        variables.put(variableName, undefinedValue);
      }
   }
   else {
    Value undefinedValue = new Value();
    variables.put(variableName, undefinedValue);
   }
  }
  else {
    Value undefinedValue = new Value("UNDEFINED", null);
    variables.put(variableName, undefinedValue);
   }
}

    @Override
    public void exitPrint_statement(BaritsuParser.Print_statementContext ctx) {
       String var = ctx.ID().getText();
       if(variables.containsKey(var)){
         Value value = variables.get(var);
         System.out.println(var + " = " + value.value + " :: " + value.type);
       }
       else {
         System.out.println("UNDEFINED");
       };
    }
}