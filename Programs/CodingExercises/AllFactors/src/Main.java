/*
Coding exercise 21: All factors of a number
 */
public class Main {
    public static void main(String args[]) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i=1; i<= number/2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(number);
    }
}
