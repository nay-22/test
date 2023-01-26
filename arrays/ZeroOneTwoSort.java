package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ZeroOneTwoSort {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Sorted Array: " + Arrays.toString(sort012(arr)));
    }

    public static Integer[] sort012(Integer[] arr) {
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0 -> zero++; 
                case 1 -> one++;
                case 2 -> two++;
            }
        }
        int x = 0;
        while (zero > 0) {
            arr[x++] = 0;
            zero--;
        }
        while (one > 0) {
            arr[x++] = 1;
            one--;
        }
        while (two > 0) {
            arr[x++] = 2;
            two--;
        }
        return arr;
    }
}
