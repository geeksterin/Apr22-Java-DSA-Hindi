import java.util.Scanner;

public class Test2 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // size input
        int size = scn.nextInt();
        // array initialize
        int[] arr = new int[size];
        // input
        input(arr);

        // equilibriumIndex(arr);
        equilibriumIndexOptimized(arr);
    }

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void equilibriumIndex(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int leftsum = sum(arr, 0, i - 1);
            int rightsum = sum(arr, i + 1, len - 1);
            if (leftsum == rightsum) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void equilibriumIndexOptimized(int[] arr) {
        int len = arr.length;
        int leftsum = 0;
        int rightsum = sum(arr, 1, len - 1);
        for (int i = 0; i < len; i++) {
            if (leftsum == rightsum) {
                System.out.println(i + 1);
                return;
            }
            if (i == len - 1) {
                break;
            }
            leftsum += arr[i];
            rightsum -= arr[i + 1];
        }
        System.out.println(-1);
    }

    public static int sum(int[] arr, int start, int end) {
        int ans = 0;
        for (int i = start; i <= end; i++) {
            ans += arr[i];
        }
        return ans;
    }
}