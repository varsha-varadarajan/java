/*
Sum of all even digits in a number
 */

public class Main {
    public static void main(String args[]) {
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(0));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            int lsd = number%10;
            number /= 10;
            if (lsd%2 == 0) {
                sum += lsd;
            }
        }
        return sum;
    }
}
