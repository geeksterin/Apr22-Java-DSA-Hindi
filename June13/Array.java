import java.util.Scanner;

public class Array {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // size
        int size = scn.nextInt();
        // intialization
        int[] arr = new int[size];
        // input
        input(arr, size);
        // print
        printArray(arr);
    }

    public static void input(int[] arr, int size) {
        // int size = arr.length;
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}