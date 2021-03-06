/*
* *****
* ** **
* * * *
* ** **
* *****
 */

public class Main {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void someMethod(int d, int velo[]) {
        int min = 1;
        int i = 0;
        for (i=0; i<velo.length; i++) {
            if (velo[i]*min > d) {
                break;
            }
            min++;
        }
        if (i == velo.length) {
            System.out.println("Success");
        } else {
            System.out.println("Escaped");
        }
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i=0; i< number; i++) {
            for (int j=0; j< number; j++) {
                if (i==0 || i==number-1) {
                    System.out.print("*");
                }
                else if (j==0 || j==number-1) {
                    System.out.print("*");
                }
                else if (i==j || (i+j)==(number-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
