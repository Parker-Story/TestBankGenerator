import java.io.*;

public abstract class LogicQuestion
{
   private String p;
   private String q;
   private String r;

   public LogicQuestion(String [] statements, int numStatements)
   {
      p = statements[0];           // at least two statements always needed
      q = statements[1]; 
      r = "";     
      if (numStatements > 2)
         r = statements[2];   
   }
   
   public String getP()
   {
      return p;
   }
   
   public String getQ()
   {
      return q;
   }

   public String getR()
   {
      return r;
   }

   public static String getNegation(String statement)
   {
      StringBuilder str = new StringBuilder(statement);
      int isIndex  = str.indexOf(" is ");
      int notIndex = str.indexOf(" not ");
      if (notIndex < 0)                        // if it is a positive statement
         str.insert(isIndex + 3, " not");      // insert not after "is "
      else                                     // if it is a negative statement
         str.delete(notIndex, notIndex + 4);   // remove "not "
      return str.toString();
   }
   
   public String defaultSettings(double grade, boolean oneAnswer, boolean shuffle)
   {
      return String.format("%s%4.2f%s\n%s\n%s\n%s\n%s%b%s\n%s%b%s\n%s\n%s\n%s\n%s\n%s\n", "<defaultgrade>", grade, "</defaultgrade>",
                    "<penalty>0.3333333</penalty>",
                    "<hidden>0</hidden>",
                    "<idnumber></idnumber>",
                    "<single>", oneAnswer, "</single>",
                    "<shuffleanswers>", shuffle, "</shuffleanswers>",
                    "<answernumbering>none</answernumbering>",
                    "<showstandardinstruction>0</showstandardinstruction>",
                    "<correctfeedback><text>Your answer is correct.</text></correctfeedback>",
                    "<partiallycorrectfeedback><text>Your answer is partially correct.</text></partiallycorrectfeedback>",
                    "<incorrectfeedback><text>Your answer is incorrect.</text></incorrectfeedback><shownumcorrect/>");
   }
   
   public abstract String generate();
}