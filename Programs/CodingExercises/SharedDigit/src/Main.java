import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String args[]) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println("***********");
        System.out.println(hasSharedAnyNumberOfDigits(15, 253));
        System.out.println(hasSharedAnyNumberOfDigits(15, 15));
        System.out.println(hasSharedAnyNumberOfDigits(-15, 1589));
        System.out.println(hasSharedAnyNumberOfDigits(12, 89));
        System.out.println(hasSharedAnyNumberOfDigits(0, 0));
    }

    /*
    Coding Exercise 18: Shared Digit
    Input 2 numbers - between 10 and 99
    return true if both numbers share a digit - eg 51, 55
    return false if out of range, or doesn't share
 */
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int num1_lsd = num1 % 10;
        int num1_msd = num1 / 10;
        int num2_lsd = num2 % 10;
        int num2_msd = num2 / 10;

        if (num1_lsd == num2_lsd
            || num1_lsd == num2_msd
            || num1_msd == num2_msd
            || num1_msd == num2_lsd) {
            return true;
        }
        return false;
    }

    /*
    Uses set to find if numbers of any length share digits
     */
    public static boolean hasSharedAnyNumberOfDigits(int num1, int num2) {
        Set<Integer> digitSet = new HashSet<Integer>();

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num1 == num2) {
            return true;
        }

        while (num1 > 0) {
            digitSet.add(num1%10);
            num1 /= 10;
        }

        while (num2 > 0) {
            if (digitSet.contains(num2%10)) {
                return true;
            }
            num2 /= 10;
        }
        return false;
    }
}
