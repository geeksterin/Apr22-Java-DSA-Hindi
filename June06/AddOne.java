import java.util.Scanner;

public class AddOne {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = addOne(arr);
        printArray(ans);
    }

    public static int[] addOne(int[] arr) {
        int n = arr.length;
        boolean allnine = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 9) {
                allnine = false;
                break;
            }
        }
        if (allnine) {
            int[] ans = new int[n + 1];
            ans[0] = 1;
            return ans;
        }
        int[] ans = new int[n];
        int sum = 0;
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            sum = (carry + arr[i]);
            ans[i] = (sum % 10);// remainder
            carry = (sum / 10);// quotient
        }
        return ans;

    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}