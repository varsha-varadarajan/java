/*
Palindrome Number
 */

public class NumberPalindrome {
    public static void main(String args[]) {
        System.out.println(isPalindrome(0) ? "0 is a palindrome": "0 is not a palindrome");
        System.out.println(isPalindrome(-1221) ? "-1221 is a palindrome": "-1221 is not a palindrome");
        System.out.println(isPalindrome(-1222) ? "-1222 is a palindrome": "-1222 is not a palindrome");
        System.out.println(isPalindrome(1221) ? "1221 is a palindrome": "1221 is not a palindrome");
        System.out.println(isPalindrome(1222) ? "1222 is a palindrome": "1222 is not a palindrome");
    }

    static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int numberCopy = number;
        int reverse = 0;

        while (numberCopy != 0) {
            int lsd = numberCopy % 10;
            reverse = reverse * 10 + lsd;
            numberCopy = numberCopy / 10;
        }

        return number == reverse;
    }
}
