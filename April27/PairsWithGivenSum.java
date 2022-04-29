import java.util.*;

public class PairsWithGivenSum {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // size input
        int size = scn.nextInt();
        // array initialize
        int[] arr = new int[size];
        // input
        input(arr);
        int sum = scn.nextInt();
        pairSum(arr, sum);
    }

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void pairSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    // System.out.println("[" + i + "," + j + "]");//indices
                    System.out.println("[" + arr[i] + "," + arr[j] + "]");// values
                }
            }
        }
    }

}
