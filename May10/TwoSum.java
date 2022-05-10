import java.util.Scanner;

public class TwoSum {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] ans = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] twoSum(int[] arr) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
