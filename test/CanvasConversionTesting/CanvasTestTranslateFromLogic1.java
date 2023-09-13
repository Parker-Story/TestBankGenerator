public class CanvasTestTranslateFromLogic1 extends LogicQuestion {
    int qNumber;

    public CanvasTestTranslateFromLogic1(String[] statements, int questionNumber) {
        super(statements, 3); // Statements will be assigned to strings p, q, and r
        qNumber = questionNumber;
    }

    public String generate() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("%s\n","<qti-assessment-item"));
        str.append(String.format("%s\n","xmlns=\"http://www.imsglobal.org/xsd/qti/imsqtiasi_v3p0\""));
        str.append(String.format("%s\n","xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""));
        str.append(String.format("%s\n","xsi:schemaLocation=\"http://www.imsglobal.org/xsd/imsqtiasi_v3p0"));
        str.append(String.format("%s\n","https://purl.imsglobal.org/spec/qti/v3p0/schema/xsd/imsqti_asiv3p0_v1p0.xsd\""));
        str.append(String.format("%s\n","identifier=\"TranslateFromLogic1\""));
        str.append(String.format("%s\n","time-dependent=\"false\""));
        str.append(String.format("%s\n","xml:lang=\"en-US\""));
        
        str.append(String.format("%s\n","<qti-response-declaration base-type=\"identifier\" cardinality=\"single\" identifier=\"RESPONSE\">"));
        str.append(String.format("%s\n","<qti-correct-response>"));
        str.append(String.format("%s\n","<qti-value>I</qti-value>")); // Assign correct response
        str.append(String.format("%s\n","</qti-correct-response>"));
        str.append(String.format("%s\n","</qti-response-declaration> base-type=\"float\" cardinality=\"single\" identifier=\"SCORE\">\""));
        str.append(String.format("%s\n","<qti-default-value>"));
        str.append(String.format("%s\n","<qti-value>1</qti-value>"));
        str.append(String.format("%s\n","</qti-default-value>"));
        str.append(String.format("%s\n","</qti-outcome-declaration>"));

        // Question Text
        str.append(String.format("%s\n","<qti-item-body>"));
        str.append(String.format("%s\n %s %s\n %s %s\n %s %s\n %s\n %s\n", "Let p, q and r be the following statements.",
                                                                           "p:", getP(),
                                                                           "q:", getQ(),
                                                                           "r:", getR(),
                                                                           "Consider the logic expression below\n P &and; Q",
                                                                           "Select the correct English translation for the logic expression."));     
        
        str.append(String.format("%s\n","<qti-choice-interaction max-choices=\"1\" min-choices=\"1\" response-identifier=\"RESPONSE\">"));  
        
        // Answer Choices                                                                                                                                                                                                 
        str.append(String.format("%s %s %s %s %s %s %s\n","<qti-simple-choice identifier=\"A\">", 
                      getNegation(getP()), "and,", getQ(), "or", getR(),
                      "</qti-simple-choice>"));
        str.append(String.format("%s %s %s %s %s\n","<qti-simple-choice identifier=\"B\">", 
                      getP(), "or", getQ(),"</qti-simple-choice>"));
        str.append(String.format("%s %s %s %s %s %s %s\n","<qti-simple-choice identifier=\"C\">", 
                      getP(),"or,", getQ(), "and", getR(),
                      "</qti-simple-choice>"));
        str.append(String.format("%s %s %s %s %s %s %s\n","<qti-simple-choice identifier=\"D\">", 
                      getP(), "or,", getNegation(getQ()), "and", getR(),
                      "</qti-simple-choice>"));
        str.append(String.format("%s %s %s %s %s %s %s\n","<qti-simple-choice identifier=\"E\">", 
                      getP(), "and,", getQ(), "or", getR(),
                      "</qti-simple-choice>"));
        str.append(String.format("%s %s %s %s %s %s %s\n","<qti-simple-choice identifier=\"F\">", 
                      getP(), "and,", getQ(), "or", getNegation(getR()),
                      "</qti-simple-choice>"));
        str.append(String.format("%s %s %s %s %s\n","<qti-simple-choice identifier=\"G\">", 
                      getNegation(getP()), "and", getQ(),
                      "</qti-simple-choice>"));
        str.append(String.format("%s %s %s %s %s %s %s\n","<qti-simple-choice identifier=\"H\">", 
                      getNegation(getP()), "or,", getQ(), "and", getR(),
                      "</qti-simple-choice>"));
        str.append(String.format("%s %s %s %s %s\n","<qti-simple-choice identifier=\"I\">", 
                      getP(), "and", getQ(),
                      "</qti-simple-choice>"));
        str.append(String.format("%s\n","</qti-choice-interaction>"));
        str.append(String.format("%s\n","</qti-item-body>"));
        str.append(String.format("%s\n","<qti-response-processing template=\"https://purl.imsglobal.org/spec/qti/v3p0/rptemplates/match_correct\"/>"));
        str.append(String.format("%s\n","</qti-assessment-item>"));
        
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