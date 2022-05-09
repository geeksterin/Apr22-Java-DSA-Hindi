import java.util.Scanner;
import java.util.Arrays;

public class Test3 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // size input
        int size = scn.nextInt();
        // array initialize
        int[] arr = new int[size];
        // input
        input(arr);

        printIncDec(arr);
    }

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void printIncDec(int[] arr) {
        // sort the array
        insertionSort(arr);// (O(n^2))
        // Arrays.sort(arr);// o(nlogn)
        int n = arr.length;
        for (int i = 0; i < (n / 2); i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = n - 1; i >= (n / 2); i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {// n
            for (int j = i - 1; j >= 0; j--) {// n
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[j] = ((arr[i] + arr[j]) - (arr[i] = arr[j]));
    }
}