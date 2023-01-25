package arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KthMinMax {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter K value: ");
        int K = in.nextInt();
        System.out.println("Kth Smallest element = " + kthSmallest(arr, K));
        System.out.println("Kth Largest element = " + kthLargest(arr, K));
    }

    public static int kthSmallest(Integer[] arr, int K) {
        Arrays.sort(arr);
        return arr[K-1];
    }

    public static int kthLargest(Integer[] arr, int K) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[K-1];
    }
}
