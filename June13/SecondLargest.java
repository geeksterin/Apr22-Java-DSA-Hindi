import java.util.Scanner;

public class SecondLargest {
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
        // second largest
        secondLargest(arr);

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

    public static void secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (value > max) {
                smax = max;
                max = value;
            } else if (value > smax && value != max) {
                smax = value;
            }
        }
        System.out.println("max is" + max);
        System.out.println("second max is" + smax);
    }
}