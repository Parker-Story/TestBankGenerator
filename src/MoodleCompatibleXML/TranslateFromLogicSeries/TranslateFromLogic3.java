public class TranslateFromLogic3 extends LogicQuestion
{
   int qNumber;
   
   public TranslateFromLogic3(String [] statements, int questionNumber)
   {
      super(statements, 3);  // Statements will be assigned to strings p, q, and r
      qNumber = questionNumber;
   }

   public String generate()
   {
      StringBuilder str = new StringBuilder();
      str.append(String.format("%s\n%s %d %s\n","<question type=\"multichoice\">", "<name> <text>Translate Sentence From Logic", qNumber, "</text> </name>"));
      str.append(String.format("%s %s %s %s %s %s %s \n", "<questiontext format='html'> <text><![CDATA[<p dir='ltr' style='text-align: left;'>Let P, Q, and R be the following statements:</p><p dir='ltr' style='text-align: left;'><strong>P: ", getP(), "</strong></p><p dir='ltr' style='text-align: left;'><strong>Q: ", getQ(), "</strong></p><p dir='ltr' style='text-align: left;'><strong>R: ", getR(),"</strong></p>"));
      str.append(String.format("%s %s %s\n", "<p dir='ltr' style='text-align: left;'>Consider the logic expression below.</p><p><strong>", "P &and; (Q &or; R)", "</strong></p>"));
      str.append(String.format("%s", "<p>Select the correct English translation for the logic expression.</p>]]></text> </questiontext>"));
      str.append(defaultSettings(1.0, true, true));           // grade is 1 pt, one answer, shuffle answers
      str.append(String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", getNegation(getP()), "and,", getQ(), "or", getR(), "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", getP(), "or", getQ(), "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));                                                                                        
      str.append(String.format("%s\n%s\n%s\n%s\n %s %s %s %s %s %s", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", getP(),"or,", getQ(), "and", getR(), "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n %s %s %s %s %s %s", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", getP(), "or,", getNegation(getQ()), "and", getR(), "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n %s %s %s %s %s %s", "<answer fraction=\"100\" format=\"html\">",
                    "<text><![CDATA[<p>", getP(), "and,", getQ(), "or", getR(), "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n %s %s %s %s %s %s", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", getP(), "and,", getQ(), "or", getNegation(getR()), "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n %s %s %s %s", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", getP(), "and", getR(), "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n %s %s %s %s", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", getNegation(getP()), "and", getQ(), "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n %s %s %s %s %s %s", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", getNegation(getP()), "or,", getQ(), "and", getR(), "</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n%s %s %s %s", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>", getP(), "and", getQ(),"</p>]]></text>",
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
      TranslateFromLogic3 question = new TranslateFromLogic3(array, 1);
      System.out.println(question.generate());
   
   }
}