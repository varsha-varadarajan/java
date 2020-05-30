import java.util.Arrays;
import java.util.Scanner;

/*
 * @created 29/05/2020 - 07:06
 * @project MinElementChallenge
 * @author Varsha Varadarajan
 */
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("Enter the number of integers: \r");
        int count = sc.nextInt();

        int[] arr = readIntegers(count);
        System.out.println(Arrays.toString(arr));
        int min = findMin(arr);
        System.out.println("Minimum value in array is " + min);
    }

    private static int[] readIntegers(int count) {
        int i = 1;
        int arr[] = new int[count];
        while (i <= count) {
            System.out.print("Enter integer #" + i + ": \r");
            arr[i-1] = sc.nextInt();
            i++;
        }
        return arr;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
