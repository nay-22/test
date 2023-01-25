package arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class KthMinMax {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter K value: ");
        int k = in.nextInt();
        System.out.print("Kth smallest element: " + kthSmallest(arr, k));
        System.out.print("\nKth largest element: " + kthLargest(arr, k));
    }

    public static int kthSmallest(Integer[] arr, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        for (int i = 0; i < k-1; i++) {
            q.poll();
        }
        return q.peek();
    }

    public static int kthLargest(Integer[] arr, int k) {
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        for (int i = 0; i < k-1; i++) {
            q.poll();
        }
        return q.peek();
    }

    // public static int kthSmallest(Integer[] arr, int K) {
    //     Arrays.sort(arr);
    //     System.out.println(Arrays.toString(arr));
    //     return arr[K-1];
    // }

    // public static int kthLargest(Integer[] arr, int K) {
    //     Arrays.sort(arr, Collections.reverseOrder());
    //     System.out.println(Arrays.toString(arr));
    //     return arr[K-1];
    // }

}
