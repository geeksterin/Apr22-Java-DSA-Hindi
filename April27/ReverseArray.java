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
        for (int i = 0; i < arr.length / 2; i++) {
            // swap ->(arr[i],arr[arr.length-i-1])
            // b=((a+b)-(a=b))
            // a=arr[i]
            // b=arr[j]

            int j = arr.length - i - 1;

            // swap only aand b
            // int a = arr[i];
            // int b = arr[j];
            // b = ((a + b) - (a = b));

            // arr[i] = b;
            // arr[j] = a;

            // actual swap in array
            arr[j] = ((arr[i] + arr[j]) - (arr[i] = arr[j]));
        }
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}
