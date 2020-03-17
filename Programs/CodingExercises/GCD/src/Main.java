public class Main {
    public static void main(String args[]) {
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(1010, 10));
    }

    /*
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        return gcd(first, second);
    }
    */

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int min = Math.min(first, second);
        int gcd = 1;
        for (int i = 2; i <= min; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
