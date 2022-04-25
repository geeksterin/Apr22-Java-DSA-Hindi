import java.util.*;

public class CountEvenValues {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // size input
        int size = scn.nextInt();
        // array initialize
        int[] arr = new int[size];
        // input
        input(arr);
        countEvenValues(arr);
        countOddValues(arr);
    }

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void countEvenValues(int[] arr) {
        int countOfEven = 0;// count of even
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countOfEven++;
            }
        }
        System.out.println("Even element count is: " + countOfEven);
    }

    public static void countOddValues(int[] arr) {
        int countOfOdd = 0;// count of even
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                countOfOdd++;
            }
        }
        System.out.println("Even element count is: " + countOfOdd);
    }

}
