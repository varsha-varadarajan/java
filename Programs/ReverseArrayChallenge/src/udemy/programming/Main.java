package udemy.programming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a[] = new int[] {1,2,3,4,5};
        System.out.println("Original array " + Arrays.toString(a));
        reverseArray(a);
        System.out.println("Reverse array " + Arrays.toString(a));

        a = new int[] {1,2,3,4};
        System.out.println("Original array " + Arrays.toString(a));
        reverseArray(a);
        System.out.println("Reverse array " + Arrays.toString(a));
    }

    private static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}
