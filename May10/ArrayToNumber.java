import java.util.Scanner;

public class ArrayToNumber {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1 };
        int ans = convert(arr);
        System.out.println(ans);
    }

    public static int convert(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i];
            ans = (ans) * 10 + digit;
        }
        return ans;
    }
}
