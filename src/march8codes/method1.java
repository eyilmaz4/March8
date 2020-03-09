package march8codes;

public class method1 {
    public static void main(String[] args) {
        addInts(2, 3);
        addDoubles(1.0, 2.0);
        addChars('a','b');
        addStrings("a", "b");
       // addTwoDouble(1.0,2.0);
    }

    public static void addInts(int a, int b) {
        int ab = a + b;
        System.out.println(ab);
    }
    static int addTwo(int a, int b){
        return a+b;


    }

    public static void addDoubles(double a, double b) {
        double ab = a + b;
        System.out.println(ab);
    }
//    public static double addTwoDouble(double a, double b){
//        return a+b;
//    }

    public static void addChars(char a, char b) {

        System.out.println( a+ b);
    }

    public static void addStrings(String a, String b) {
        String ab = a + b;
        System.out.println(ab);
    }

}