import java.util.*;

public class MergeTwoSorttedOpti {
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
        // int[] ans = mergeArrays(arr1, arr2);
        int[] ans = mergeArrays_(arr1, arr2);
        printArray(ans);
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n + m];
        int p1 = 0, p2 = 0, k = 0;
        while (p1 < n && p2 < m) {
            int v1 = arr1[p1];
            int v2 = arr2[p2];
            if (v1 < v2) {
                ans[k] = v1;
                p1++;
            } else {// >=
                ans[k] = v2;
                p2++;
            }
            k++;
        }

        // p2 is at end
        while (p1 < n) {
            ans[k] = arr1[p1];
            p1++;
            k++;
        }

        // p1 is at end
        while (p2 < m) {
            ans[k] = arr2[p2];
            p2++;
            k++;
        }

        return ans;
    }

    public static int[] mergeArrays_(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n + m];
        int p1 = 0, p2 = 0, k = 0;
        while (p1 < n || p2 < m) {
            int v1 = p1 == n ? Integer.MAX_VALUE : arr1[p1];
            int v2 = p2 == m ? Integer.MAX_VALUE : arr2[p2];
            if (v1 < v2) {
                ans[k] = v1;
                p1++;
            } else {// >=
                ans[k] = v2;
                p2++;
            }
            k++;
        }

        return ans;
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}