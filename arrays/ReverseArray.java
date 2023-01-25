package arrays;
import java.util.Scanner;
public class ReverseArray {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        arr = reverseArray(arr);
        System.out.println("Reversed Array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    public static int[] reverseArray(int arr[]) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }

}
