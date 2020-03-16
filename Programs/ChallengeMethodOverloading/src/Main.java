public class Main {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(100.5));
        System.out.println(calcFeetAndInchesToCentimeters(6,-10));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
        System.out.println(feet + " - " + inch);
        if (feet >= 0 && inch >=0 && inch <12) {
            // System.out.println(feet + " - " + inch);
            return (feet*12 + inch)*2.54;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inch) {
        if (inch >= 0) {
            return calcFeetAndInchesToCentimeters((int)inch/12, inch%12);
        }
        return -1;
    }
}
