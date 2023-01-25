package arrays;
import java.util.Scanner;

public class MinMax {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The Max Element = " + getMax(arr));
        System.out.println("The Min Element = " + getMin(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int ele: arr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int ele: arr) {
            if (ele < min) {
                min = ele;
            }
        }
        return min;
    }
}
