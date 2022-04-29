import java.util.Scanner;

public class SelectionSort {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = { 7, 5, 4, 3, 2, 1, 6 };
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            int maxidx = 0;// index of maximum value
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[maxidx]) {
                    maxidx = j;
                }
            }
            swap(arr, i, maxidx);
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
