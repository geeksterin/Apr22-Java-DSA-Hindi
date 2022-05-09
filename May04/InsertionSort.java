import java.util.Scanner;

public class InsertionSort {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = { 10, 8, 7, 3, 2, 4, 1, 5, 6 };
        long start = System.currentTimeMillis();
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
        long end = System.currentTimeMillis();
        long time = end - start;// total time taken by program
        System.out.println(time);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[j] = ((arr[i] + arr[j]) - (arr[i] = arr[j]));
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
