public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if (num1 > 0 && num2 > 0 || num1 < 0 && num2 < 0) {
            int firstInt = (int)(num1 * 1000);
            int secondInt = (int)(num2 * 1000);

            if (firstInt == secondInt) {
                return true;
            }
        }
        return false;
    }
}
