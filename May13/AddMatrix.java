import java.util.Scanner;

public class AddMatrix {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter row");
        // row
        int r = scn.nextInt();
        System.out.print("Enter column");
        // column
        int c = scn.nextInt();
        // Array initialize
        int[][] a = new int[r][c];
        System.out.print("Enter first matrix values");
        // input
        inputValues(a);

        int[][] b = new int[r][c];

        System.out.println("Enter second  matrix values");
        // input
        inputValues(b);

        int[][] sum = addTwoMatrix(a, b);

        System.out.println("Sum of matrices");

        // print
        printArray(sum);

        // int[] array = { 1, 2, 3, 4 };

        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    }

    public static void inputValues(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void printArray(int[][] arr) {
        // int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                // sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println(sum);
    }

    public static int[][] addTwoMatrix(int[][] a, int[][] b) {
        int r = a.length;
        int c = a[0].length;
        int[][] ans = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = a[i][j] + b[i][j];
            }
        }
        return ans;
    }

}