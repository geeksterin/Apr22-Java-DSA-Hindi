import java.util.*;

public class PrintEvenValues {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // size input
        int size = scn.nextInt();
        // array initialize
        int[] arr = new int[size];
        // input
        input(arr);
        printEvenValues(arr);
    }

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void printEvenValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printOddValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

}
