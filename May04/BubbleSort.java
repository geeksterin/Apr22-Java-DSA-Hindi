import java.util.Scanner;

public class BubbleSort {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = { 10, 8, 7, 3, 2, 4, 1, 5, 6 };
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
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
