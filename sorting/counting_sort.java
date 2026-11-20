
import java.util.*;

class counting_sort {

    static void countingSort(int[] arr) {

        int max = arr[0];

        for (int n : arr) {
            max = Math.max(max, n);
        }

        int[] count = new int[max + 1];

        // Frequency count
        for (int n : arr) {
            count[n]++;
        }

        // Cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // New array
        int[] b = new int[arr.length];

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            b[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy sorted elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        countingSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
