/*
Get the largest prime factor of a number
 */

public class Main {
    public static void main(String args[]) {
        System.out.println(getLargestPrimeNumber(16));
        System.out.println(getLargestPrimeNumber(21));
        System.out.println(getLargestPrimeNumber(217));
        System.out.println(getLargestPrimeNumber(0));
        System.out.println(getLargestPrimeNumber(45));
        System.out.println(getLargestPrimeNumber(-1));
    }

    public static int getLargestPrimeNumber(int number) {
        if (number <= 0 || number == 1) {
            return -1;
        }
        int largestPrimeFactor = 1;
        for (int i = 2; i <= number ; i++) {
            if (number % i == 0) {
                boolean isPrime = true;

                if (i != 2) {
                    for (int j = 2; j <= i/2; j++) {
                        if (i%j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime) {
                    largestPrimeFactor = i;
                }
            }
        }
        return largestPrimeFactor;
    }
}
