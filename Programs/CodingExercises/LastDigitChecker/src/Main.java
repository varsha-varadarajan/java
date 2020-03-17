/*
Coding Exercise 16: Last Digit Checker
takes 3 parameters
if atleast 2 have the same last digit, return true
parameter range 10-1000 both inclusive
return false of out of range
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int num1_lsd = num1 % 10;
        int num2_lsd = num2 % 10;
        int num3_lsd = num3 % 10;

        if (num1_lsd == num2_lsd || num1_lsd == num3_lsd || num2_lsd == num3_lsd) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }
}
