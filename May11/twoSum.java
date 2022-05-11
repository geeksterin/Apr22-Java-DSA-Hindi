import java.util.Scanner;
import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        // int[] arr = { 6, 12, 5, 7, 100, 3, -2, 5, 8 };
        int[] arr = { -2, -2, -2, 2, 2, 6, 8, 12, 12 };
        int target = 10;
        // NO DUPLICATE ANSWER EXIST
        TwoSum(arr, target);
        // TwoSumWithDuplicacy(arr, target);
    }

    public static void TwoSum(int[] arr, int target) {
        // Arrays.sort(arr);
        int st = 0;
        int end = arr.length - 1;
        while (st < end) {

            //

            if (st != 0 && arr[st] == arr[st - 1]) {
                st++;
                continue;
            }

            // while (st != 0 && arr[st] == arr[st - 1]) {// duplicacy
            // st++;
            // }

            // while (end!=arr.length-1 && arr[end] == arr[end + 1]) {// duplicacy
            // end--;
            // }

            int sum = arr[st] + arr[end];
            if (sum < target) {
                st++;
            } else if (sum > target) {
                end--;
            } else {
                System.out.println("(" + arr[st] + "," + arr[end] + ")");
                st++;
                end--;
            }
        }
    }

    public static void TwoSumWithDuplicacy(int[] arr, int target) {
        // Arrays.sort(arr);
        int st = 0;
        int end = arr.length - 1;
        while (st < end) {
            int sum = arr[st] + arr[end];
            if (sum < target) {
                st++;
            } else if (sum > target) {
                end--;
            } else {
                System.out.println("(" + arr[st] + "," + arr[end] + ")");
                st++;
                end--;
            }
        }
    }
}
