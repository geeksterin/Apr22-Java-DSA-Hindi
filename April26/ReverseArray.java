import java.util.*;

public class ReverseArray {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // size input
        int size = scn.nextInt();
        // array initialize
        int[] arr = new int[size];
        // input
        input(arr);
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void reverseArray(int[] arr) {
        int[] copy = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            // copy[arr.length - i - 1] = arr[i];
            copy[j] = arr[i];
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = copy[i];
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
