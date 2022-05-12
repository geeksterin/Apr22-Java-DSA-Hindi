import java.util.Scanner;

public class TwoDArray {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // ARRAY DECLARATION
        arrayDeclaration();
    }

    public static void arrayDeclaration() {
        int[][] arr = new int[3][4];
        // System.out.println(arr[3]);
        // System.out.println(arr[0][0]);
        // System.out.println(arr[1][0]);
        // System.out.println(arr[0][4]);
        // System.out.println(arr[0][3]);
        // arr[0][3]=10;
        // System.out.println(arr[0][3]);

        // int row=arr.length;//
        // int column=arr[0].length;
        // System.out.println(row);
        // System.out.println(column);
        arr[0][3] = 4;
        // printArray(arr);
    

    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}