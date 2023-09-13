public class TranslateFromLogic9 extends LogicQuestion
{
   int qNumber;
   
   public TranslateFromLogic9(String [] statements, int questionNumber)
   {
      super(statements, 3);  // Statements will be assigned to strings p, q, and r
      qNumber = questionNumber;
   }

   public String generate()
   {
      StringBuilder str = new StringBuilder();
      str.append(String.format("%s\n%s %d %s\n","<question type=\"multichoice\">", "<name> <text>Translate Sentence From Logic", qNumber, "</text> </name>"));
      str.append(String.format("%s %s %s %s %s %s %s \n", "<questiontext format='html'> <text><![CDATA[<p dir='ltr' style='text-align: left;'>Let P, Q, and R be the following statements:</p><p dir='ltr' style='text-align: left;'><strong>P: ", getP(), "</strong></p><p dir='ltr' style='text-align: left;'><strong>Q: ", getQ(), "</strong></p><p dir='ltr' style='text-align: left;'><strong>R: ", getR(),"</strong></p>"));
      str.append(String.format("%s %s %s %s %s %s %s\n", "<p dir='ltr' style='text-align: left;'>Consider the statement below.</p><p><strong>", getNegation(getP()), "or,", getQ(), "and", getR(), "</strong></p>"));
      str.append(String.format("%s", "<p>Select the correct logic expression for the statement.</p>]]></text> </questiontext>"));
      str.append(defaultSettings(1.0, true, true));           // grade is 1 pt, one answer, shuffle answers
      str.append(String.format("%s\n%s\n%s\n%s %s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", "~P &and; (Q &or; R)", "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s %s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", "P &or; Q","</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));                                                                                        
      str.append(String.format("%s\n%s\n%s\n%s %s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", "P &or; (Q &and; R)", "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s %s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", "P &or; (~Q &and; R)", "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s %s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", "P &and; (Q &or; R)", "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s %s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", "P &and; (Q &or; ~R)", "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s %s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", "P &and; R", "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s %s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", "~P &and; Q", "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s %s\n%s\n", "<answer fraction=\"100\" format=\"html\">",
                    "<text><![CDATA[<p>","~P &or; (Q &and; R)", "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s %s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", "P &and; Q","</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n", "</question>"));
      return str.toString();
   }
   
   public static void main(String[] args)
   {
      String[] array = new String[3];
      array[0] = "pizza is delicious";
      array[1] = "coffee is essential";
      array[2] = "coffee is expensive";
      TranslateFromLogic9 question = new TranslateFromLogic9(array, 1);
      System.out.println(question.generate());
   
   }
}