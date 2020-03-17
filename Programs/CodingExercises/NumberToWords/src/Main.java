/*
Coding Exercise - 23
Print number to words
100 - One Zero Zero
 */

public class Main {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (number == 0) {
            System.out.println("Zero");
        }
        int reverse = reverse(number);
        int digitCountDiff = getDigitCount(number) - getDigitCount(reverse);

        while (reverse > 0) {
            int lsd = reverse%10;
            switch (lsd) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
            }
            reverse = reverse/10;
        }
        for (int i = 1; i <= digitCountDiff; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        boolean isNeg = false;
        if (number < 0) {
            isNeg = true;
            number = Math.abs(number);
        }
        while (number > 0) {
            reverse = reverse * 10 + number%10;
            number /= 10;
        }
        if (isNeg) {
            return reverse * -1;
        } else {
            return reverse;
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int numOfDigits = 0;
        while (number > 0) {
            number /= 10;
            numOfDigits++;
        }
        return numOfDigits;
    }
}
