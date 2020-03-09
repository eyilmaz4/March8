package march8codes;
public class total {
    public static void main(String[] args) {
        numOfChars("Java is good");
        numOfWords("happy womens day");
//        numOfLines('my file:'a' b' '\0');

    }

    public static void numOfChars(String sentence) {
        int counter = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != '\0' || sentence.charAt(i) != '\1') {
                counter++;
            }

        }System.out.println(counter);

    }
    public static void numOfWords(String sentence) {
        int counter = 1;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 32) {
                counter++;
            }

        }System.out.println(counter+1);

    }
//    public static void numOfLines(char array) {
//        int counter = 0;
//
//        for (int i = 0; i < sentence.length(); i++) {
//            if (sentence.charAt(i) == '\0') {
//                counter++;
//            }
//
//        }System.out.println(counter);

    }

