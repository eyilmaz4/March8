package march8codes;

public class carRangeCalculator {
    public static void main(String[] args) {
        carRange(26, 40);
        System.out.println(carRangeS(21.5,35.7));

    }

    public static void carRange(double MPG, double gallon) {
        double range = MPG * gallon;
        System.out.println("Range;" + (int) range);
    }

    public static int carRangeS(double MPGs, double gallons) {
        return (int) (MPGs * gallons);
    }
}