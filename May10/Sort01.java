import java.util.Scanner;

public class Sort01 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = { 1, 0,0,0,0,1,1,1,0,0,1,0 };
        printArray(arr);
        // sortArray(arr);
        sortArrayOptimized(arr);
        printArray(arr);

    }

    public static void sortArray(int[] arr) {
        int zero = 0;
        int one = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else {
                one++;
            }
        }

        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
        for (int i = zero; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void sortArrayOptimized(int[] arr) {
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[j] = ((arr[i] + arr[j]) - (arr[i] = arr[j]));
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
