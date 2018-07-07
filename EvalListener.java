import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

public class EvalListener extends BaritsuBaseListener {
  BaritsuParser parser;
  public EvalListener(BaritsuParser parser) {
    this.parser = parser;
  }

  @Override
  public void enterProgram(BaritsuParser.ProgramContext ctx) {
    System.out.println("Program Entered");
   }

   public void exitProgram(BaritsuParser.ProgramContext ctx) {
    System.out.println("Program Exited");
   }

   @Override
   public void enterVariable_declaration(BaritsuParser.Variable_declarationContext ctx) {
     System.out.println("Variable Declared");
    }

}