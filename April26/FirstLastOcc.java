import java.util.*;

public class FirstLastOcc {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // size input
        int size = scn.nextInt();
        // array initialize
        int[] arr = new int[size];
        // input
        input(arr);
        int value = scn.nextInt();
        // firstLastOcc(arr, value);
        firstLastOcc_(arr, value);
    }

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void firstLastOcc(int[] arr, int value) {
        int firstocc = -1;
        // FIRST OCCURENCE
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                firstocc = i;
                break;
            }
        }
        System.out.println(firstocc);
        // LAST OCCURENCE
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == value) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void firstLastOcc_(int[] arr, int value) {
        int i = 0;
        // FIRST OCCURENCE
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                break;
            }
        }
        System.out.println(i);
        // LAST OCCURENCE
        for (i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == value) {
                break;
            }
        }
        System.out.println(i);
    }

}
