import java.util.Scanner;

public class Solution {

    public static java.util.Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // sortedArrayCheck(arr);
        boolean sorted = sortedArrayCheckReturn(arr);
        if (sorted == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void sortedArrayCheck(int[] arr) {
        boolean sorted = true;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i + 1] < arr[i]) {
                sorted = false;
                break;
            }
        }
        if (sorted == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean sortedArrayCheckReturn(int[] arr) {
        boolean sorted = true;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i + 1] < arr[i]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }
}