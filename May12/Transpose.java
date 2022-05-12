import java.util.Scanner;

public class Transpose {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // row
        int r = scn.nextInt();
        // column
        int c = scn.nextInt();
        // Array initialize
        int[][] arr = new int[r][c];
        // input
        inputValues(arr);
        System.out.println("Initial ");
        // print
        printArray(arr);

        transpose(arr);

        System.out.println("After Transpose");
        printArray(arr);
    }

    public static void inputValues(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printReverseArray(int[][] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                swap(arr, i, j);
            }
        }
    }

    public static void swap(int[][] arr, int i, int j) {
        arr[j][i] = ((arr[i][j] + arr[j][i]) - (arr[i][j] = arr[j][i]));
    }

}