
import java.util.*;

class radix_sort {

    static void countingSort(int[] arr, int exp) {

        int[] count = new int[10];

        // Count digit frequency
        for (int n : arr) {
            int digit = (n / exp) % 10;
            count[digit]++;
        }

        // Cumulative frequency
        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // Create new array
        int[] b = new int[arr.length];

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;

            b[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b[i];
        }
    }

    static void radixSort(int[] arr) {

        int max = arr[0];

        for (int n : arr) {
            max = Math.max(max, n);
        }

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    public static void main(String[] args) {

        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
