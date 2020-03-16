package udemy.programming;

public class Main {

    public static void main(String[] args) {
        float myFloatMin = Float.MIN_VALUE;
        float myFloatMax = Float.MAX_VALUE;
        System.out.println("Min float value : " + myFloatMin);
        System.out.println("Max float value : " + myFloatMax);

        double myDoubleMin = Double.MIN_VALUE;
        double myDoubleMax = Double.MAX_VALUE;
        System.out.println("Min double value : " + myDoubleMin);
        System.out.println("Max double value : " + myDoubleMax);

        int myIntValue = 5/3;
        float myFloatValue = 5.5f/3;
        double myDoubleValue = 5.5d/3;

        System.out.println("Int - " + myIntValue);
        System.out.println("Float - " + myFloatValue);
        System.out.println("Double - " + myDoubleValue);

        double pounds = 108d;
        double conversionFactor = 0.45359237d;
        double kilograms = pounds * conversionFactor;

        float p = 108.5f;
        float x = 2;
        double d = p * x;

        System.out.println(kilograms);
    }
}
