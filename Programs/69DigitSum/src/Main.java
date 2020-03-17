/*
    Sum of digits in a number
 */

public class Main {
    public static void main(String args[]) {
        System.out.println("Sum of digits in -8 : " + sumOfDigits(-8));
        System.out.println("Sum of digits in 0 : " + sumOfDigits(0));
        System.out.println("Sum of digits in 125 : " + sumOfDigits(125));
        System.out.println("Sum of digits in 999 : " + sumOfDigits(999));
        System.out.println("Sum of digits in 32123 : " + sumOfDigits(32123));
    }

    // Returns sum of digits in a number
    public static int sumOfDigits(int num) {
        int sum = 0;

        if (num < 0) {
            return -1;
        }
        while (num != 0) {
            int lsd = num % 10;
            sum += lsd;
            num = num/10;
        }
        return sum;
    }
}
