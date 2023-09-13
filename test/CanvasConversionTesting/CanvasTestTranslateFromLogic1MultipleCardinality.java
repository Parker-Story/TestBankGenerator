public class CanvasTestTranslateFromLogic1MultipleCardinality extends LogicQuestion {
    int qNumber;

    public CanvasTestTranslateFromLogic1MultipleCardinality(String[] statements, int questionNumber) {
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
        str.append(String.format("%s\n","xml:lang=\"en-US\""));
        str.append(String.format("%s\n","identifier=\"TranslateFromLogic1 Multiple Choice\""));
        str.append(String.format("%s\n","time-dependent=\"false\""));    
        
        str.append(String.format("%s\n","<qti-response-declaration identifier=\"RESPONSE\" cardinality=\"multiple\" base-type=\"identifier\">"));
        str.append(String.format("%s\n","<qti-correct-response>"));
        str.append(String.format("%s\n","<qti-value>I</qti-value>")); // Assign correct response
        str.append(String.format("%s\n","<qti-value>A</qti-value>")); // Assign second correct response *(Not actually a valid response. Just testing multiple cardinality)*
        str.append(String.format("%s\n","</qti-correct-response>"));
        str.append(String.format("%s\n","</qti-response-declaration>"));
        str.append(String.format("%s\n","<qti-outcome-declaration identifier=\"SCORE\" cardinality=\"single\" base-type=\"float\"/>"));

        // Question Text
        str.append(String.format("%s\n","<qti-item-body>"));
        str.append(String.format("%s\n","<qti-choice-interaction response-identifier=\"RESPONSE\" min-choices=\"1\" max-choices=\"10\">"));
        str.append(String.format("%s\n %s %s\n %s %s\n %s %s\n %s\n %s\n", "<qti-prompt>Let p, q and r be the following statements.",
                                                                           "p:", getP(),
                                                                           "q:", getQ(),
                                                                           "r:", getR(),
                                                                           "Consider the logic expression below\n P &and; Q",
                                                                           "Select the correct English translation for the logic expression.</qti-prompt>"));     
          
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
        CanvasTestTranslateFromLogic1MultipleCardinality question = new CanvasTestTranslateFromLogic1MultipleCardinality(array, 1);
        System.out.println(question.generate());
    }
}