package march8codes;

public class removeSpaceOfSentence {
    public static void main(String[] args) {
        spaces("java loves me");
        System.out.println(spaceS("Java is so good in Sunday"));
    }
    public static void spaces(String sentence){
       String word=" ";
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)!=32){
                word+=sentence.charAt(i);

            }

        }
        System.out.println(word);
    }
    public static String spaceS(String sentence){
        String word=" ";
        for(int i=0; i<sentence.length(); i++){
            if (sentence.charAt(i)!=32){
                word+=sentence.charAt(i);
            }
            else {
                word+="-";
            }
        }
        return word;
    }
}
