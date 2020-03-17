/*
Return sum of first and last digit in number
 */

public class Main {
    public static void main(String args[]) {
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(-1));
        System.out.println(sumFirstAndLastDigit(55));
        System.out.println(sumFirstAndLastDigit(891));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int numberCopy = number;
        int numOfDigits = 0;

        while (numberCopy > 0) {
            numberCopy = numberCopy/10;
            numOfDigits++;
        }

        if (numOfDigits == 0) {
            return number;
        }
        int lsd = number%10;
        int msd = number / (int)Math.pow(10, numOfDigits-1);

        return msd + lsd;
    }
}
