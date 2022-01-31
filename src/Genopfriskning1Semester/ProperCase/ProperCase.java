package Genopfriskning1Semester.ProperCase;

public class ProperCase {

    void caseCorrection(String sentence) {
    String[] splitSentence = sentence.split(" ");

        for (int i = 0; i < splitSentence.length; i++) {
            boolean detectLowerCase = false;
            boolean worldLengthMoreThan3 = false;
            String newWord = "";
            for (int j = 0; j < splitSentence[i].length(); j++) {
                if(Character.isLowerCase(splitSentence[i].charAt(j))){
                    detectLowerCase = true;
                }

                if(splitSentence[i].length() > 3) {
                    worldLengthMoreThan3 = true;
                    // VERY important to remember substring
                    newWord = splitSentence[i].substring(0,1).toUpperCase() + splitSentence[i].substring(1);
                }
            }
            System.out.println(splitSentence[i] +" "+newWord+" "+ detectLowerCase + " "+worldLengthMoreThan3);
        }

    }

    public static void main(String[] args) {
    String sentence = "KEA is the best and is very cool";
    ProperCase properCase = new ProperCase();
    properCase.caseCorrection(sentence);
    }
}
