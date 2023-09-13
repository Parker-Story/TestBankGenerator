public class TranslateToLogic6 extends LogicQuestion
{
   int qNumber;
   
   public TranslateToLogic6(String [] statements, int questionNumber)
   {
      super(statements, 3);  // Statements will be assigned to strings p, q, and r
      qNumber = questionNumber;
   }

   public String generate()
   {
      StringBuilder str = new StringBuilder();
      str.append(String.format("%s\n%s %d %s\n","<question type=\"multichoice\">", "<name> <text>Translate Sentence to Logic", qNumber, "</text> </name>"));
      str.append(String.format("%s %s %s %s %s %s", "<questiontext format='html'> <text><![CDATA[<p dir='ltr' style='text-align: left; font-family: Arial, sans-serif;'><strong>Let P represent \"" + getP() + "\", let Q represent \"" + getQ() + "\" and let R represent \"" + getR() + "\".</p> <p>Select the symbolic form that best represents the compound statement below.</p>", "</strong><p>", getP(), " if ", getNegation(getR()), "</p>]]></text> </questiontext>"));
      str.append(defaultSettings(1.0, true, true));           // grade is 1 pt, one answer, shuffle answers
      str.append(String.format("%s\n%s\n%s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>(P &and; Q) &or; ~R</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n", "<answer fraction=\"100\" format=\"html\">",
                    "<text><![CDATA[<p>~R &rarr; P</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>(P &or; Q) &rarr; ~R</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>(P &and; Q) &rarr; ~R</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>~P &rarr; R</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>~P &rarr; Q</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>R &rarr; P &and; Q</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>Q &harr; ~P</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>P &or; (Q &and; ~R)</p>]]></text>",
                    "<feedback><text></text></feedback>",
                     "</answer>"));
      str.append(String.format("%s\n%s\n%s\n%s\n", "<answer fraction=\"0\" format=\"html\">",
                    "<text><![CDATA[<p>(P &or; ~R) &and; Q</p>]]></text>",
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
      TranslateToLogic6 question = new TranslateToLogic6(array, 1);
      System.out.println(question.generate());
   
   }
}