import java.util.*;

public class MergeTwoSorted {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // int n=scn.nextInt();
        // int[] arr1 = { 1, 3, 5, 16, 17 };
        // int[] arr2 = { 1, 2, 4, 8 };

        System.out.println("Enter size of first array");
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Values size of first array");
        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }

        System.out.println("Enter size of second array");
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter Values of Second array");
        for (int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();
        }

        printArray(arr1);
        printArray(arr2);
        int[] ans = mergeArrays(arr1, arr2);
        printArray(ans);
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        // create array
        int[] ans = new int[n + m];

        // merge arrays
        for (int i = 0; i < n; i++) {
            ans[i] = arr1[i];
        }
        for (int i = 0; i < m; i++) {
            ans[n + i] = arr2[i];
        }

        // Sorting
        Arrays.sort(ans);

        return ans;
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}