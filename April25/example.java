import java.util.*;

public class example {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // size input
        int size = scn.nextInt();
        // int size = Integer.parseInt(scn.next());
        // array initialize
        int[] arr = new int[size];
        // input
        input(arr, size);
        // PRINT ARRAY
        printArray(arr);
        // COPY ARRAY
        int[] copy = copyArray(arr);
        // PRINT COPIED ARRAY
        printArray(copy);
        // System.out.println(arr);
        System.out.println(arr + " " + copy);
    }

    public static void input(int[] arr, int size) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        // System.out.println(arr);
    }

    public static void printArray(int[] arr) {
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static int[] copyArray(int[] arr) {
        int[] narr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            narr[i] = arr[i];
        }
        return narr;
    }

}
