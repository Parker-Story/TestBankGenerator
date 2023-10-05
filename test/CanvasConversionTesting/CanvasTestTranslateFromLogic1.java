public class CanvasTestTranslateFromLogic1 extends LogicQuestion {
    int qNumber;

    public CanvasTestTranslateFromLogic1(String[] statements, int questionNumber) {
        super(statements, 3); // Statements will be assigned to strings p, q, and r
        qNumber = questionNumber;
    }

    public String generate() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("%s\n","<item ident=\"\"", qNumber));
        str.append(String.format("%s\n","<itemmetadata>"));
        str.append(String.format("%s\n","<qtimetadata>"));
        str.append(String.format("%s\n","<qtimetadatafield>"));
        str.append(String.format("%s\n","https://purl.imsglobal.org/spec/qti/v3p0/schema/xsd/imsqti_asiv3p0_v1p0.xsd\""));
        str.append(String.format("%s\n","<fieldlabel>question_type</fieldlabel>"));
        str.append(String.format("%s\n","<fieldentry>multiple_choice_question</fieldentry>"));
        str.append(String.format("%s\n","</qtimetadatafield>"));
        str.append(String.format("%s\n","<qtimetadatafield>"));
        str.append(String.format("%s\n","<fieldlabel>points_possible</fieldlabel>"));
        str.append(String.format("%s\n","<fieldentry>5</fieldentry>")); // Assign correct response
        str.append(String.format("%s\n","</qtimetadatafield>"));
        str.append(String.format("%s\n","<qtimetadatafield>"));
        str.append(String.format("%s\n","<fieldlabel>assessment_question_identifierref</fieldlabel>"));
        str.append(String.format("%s\n","<fieldentry>if6eca05e4deb6729600d74461cb79f88</fieldentry>"));
        str.append(String.format("%s\n","</qtimetadatafield>"));
        str.append(String.format("%s\n","</qtimetadata>"));
        str.append(String.format("%s\n","</itemmetadata>"));
        str.append(String.format("%s\n","<presentation>"));
        str.append(String.format("%s\n","<material>"));

        // Question Text
        str.append(String.format("%s\n %s %s\n %s %s\n %s %s\n %s\n %s\n", "<mattext texttype=\"text/html\">Let p, q and r be the following statements.",
                                                                           "p:", getP(),
                                                                           "q:", getQ(),
                                                                           "r:", getR(),
                                                                           "Consider the logic expression below\n P &and; Q",
                                                                           "Select the correct English translation for the logic expression."));     
        str.append(String.format("%s\n","</material>"));
        
        str.append(String.format("%s\n","<response_lid ident=\"response1\" rcardinality=\"Single\">"));  
        str.append(String.format("%s\n","<render_choice>"));  
        str.append(String.format("%s %d%s\n","<response_label ident=\"", qNumber, "000\">"));
        str.append(String.format("%s\n","<material>"));
        // Answer Choice 1                                                                                                                                                                                               
        str.append(String.format("%s %s %s %s %s %s %s\n","<mattext texttype=\"text/plain\">", 
                      getNegation(getP()), "and,", getQ(), "or", getR(),
                      "<mattext>"));
        str.append(String.format("%s\n","</material>"));
        str.append(String.format("%s\n","</response_label>"));

        // Answer Choice 2
        str.append(String.format("%s %d%s\n","<response_label ident=\"", qNumber, "001\">"));
        str.append(String.format("%s\n","<material>"));
        str.append(String.format("%s %s %s %s %s\n","<mattext texttype=\"text/plain\">", 
                      getP(), "or", getQ(),"</mattext>"));
        str.append(String.format("%s\n","</material>"));
        str.append(String.format("%s\n","</response_label>"));

        // Answer Choice 3   
        str.append(String.format("%s %d%s\n","<response_label ident=\"", qNumber, "002\">"));
        str.append(String.format("%s\n","</material>"));   
        str.append(String.format("%s %s %s %s %s %s %s\n","<mattext texttype=\"text/plain\">", 
                      getP(),"or,", getQ(), "and", getR(),
                      "</mattext>"));
        str.append(String.format("%s\n","</material>"));
        str.append(String.format("%s\n","</response_label>"));

        // Answer Choice 4
        str.append(String.format("%s %d%s\n","<response_label ident=\"", qNumber, "003\">"));
        str.append(String.format("%s\n","</material>"));   
        str.append(String.format("%s %s %s %s %s %s %s\n","<mattext texttype=\"text/plain\">", 
                      getP(), "or,", getNegation(getQ()), "and", getR(),
                      "</mattext>"));
        str.append(String.format("%s\n","</material>"));
        str.append(String.format("%s\n","</response_label>"));

        // Answer Choice 4
        str.append(String.format("%s %d%s\n","<response_label ident=\"", qNumber, "004\">"));
        str.append(String.format("%s\n","</material>"));  
        str.append(String.format("%s %s %s %s %s %s %s\n","<mattext texttype=\"text/plain\">", 
                      getP(), "and,", getQ(), "or", getR(),
                      "</mattext>"));
        str.append(String.format("%s\n","</material>"));
        str.append(String.format("%s\n","</response_label>"));

        // Answer Choice 5
        str.append(String.format("%s %d%s\n","<response_label ident=\"", qNumber, "005\">"));
        str.append(String.format("%s\n","</material>"));  
        str.append(String.format("%s %s %s %s %s %s %s\n","<mattext texttype=\"text/plain\">", 
                      getP(), "and,", getQ(), "or", getNegation(getR()),
                      "</mattext>"));
        str.append(String.format("%s\n","</material>"));
        str.append(String.format("%s\n","</response_label>"));

        // Answer Choice 6
        str.append(String.format("%s %d%s\n","<response_label ident=\"", qNumber, "006\">"));
        str.append(String.format("%s\n","</material>")); 
        str.append(String.format("%s %s %s %s %s\n","<mattext texttype=\"text/plain\">", 
                      getNegation(getP()), "and", getQ(),
                      "</mattext>"));
        str.append(String.format("%s\n","</material>"));
        str.append(String.format("%s\n","</response_label>"));

        // Answer Choice 7
        str.append(String.format("%s %d%s\n","<response_label ident=\"", qNumber, "007\">"));
        str.append(String.format("%s\n","</material>")); 
        str.append(String.format("%s %s %s %s %s %s %s\n","<mattext texttype=\"text/plain\">", 
                      getNegation(getP()), "or,", getQ(), "and", getR(),
                      "</mattext>"));
        str.append(String.format("%s\n","</material>"));
        str.append(String.format("%s\n","</response_label>"));

        // Answer Choice 8
        str.append(String.format("%s %d%s\n","<response_label ident=\"", qNumber, "008\">"));
        str.append(String.format("%s\n","</material>")); 
        str.append(String.format("%s %s %s %s %s\n","<mattext texttype=\"text/plain\">", 
                      getP(), "and", getQ(),
                      "</mattext>"));

        str.append(String.format("%s\n","</material>"));
        str.append(String.format("%s\n","</response_label>"));
        str.append(String.format("%s\n%s\n%s\n","</render_choice>","</response_lid>","</presentation>"));
        str.append(String.format("%s\n","<resprocessing>"));
        str.append(String.format("%s\n%s\n%s\n","<outcomes>","<decvar maxvalue=\"100\" minvalue=\"0\" varname=\"SCORE\" vartype=\"Decimal\"/>", "</outcomes>"));
        str.append(String.format("%s\n%s\n%s\n%s\n","<respcondition continue=\"No\">","<conditionvar>","<varequal respident=\"response1\">1001</varequal>","</conditionvar>"));
        str.append(String.format("%s\n","<setvar action=\"Set\" varname=\"SCORE\">100</setvar>"));
        str.append(String.format("%s\n","</respcondition>"));
        str.append(String.format("%s\n","</resprocessing>"));
        str.append(String.format("%s\n","</item>"));

        return str.toString();
    }

    private String generateChoice(String text, boolean isCorrect) {
        String correctAttribute = isCorrect ? "fraction=\"100\"" : "fraction=\"0\"";
        return String.format("<answer %s format=\"html\"><text><![CDATA[<p>%s</p>]]></text><feedback><text></text></feedback></answer>\n", correctAttribute, text);
    }

    public static void main(String[] args) {
        String[] array = new String[3];
        array[0] = "pizza is delicious";
        array[1] = "coffee is essential";
        array[2] = "coffee is expensive";
        CanvasTestTranslateFromLogic1 question = new CanvasTestTranslateFromLogic1(array, 1);
        System.out.println(question.generate());
    }
}