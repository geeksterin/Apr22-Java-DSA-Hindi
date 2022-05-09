import java.util.Scanner;

public class Test1 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 3, 2, 1 };
        // palindromeCheck(arr);
        String str = scn.nextLine();
        palindromeCheck(str);
    }

    public static void palindromeCheck(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        boolean ispalin = true;
        while (start <= end) {
            if (arr[start] != arr[end]) {
                ispalin = false;
                break;
            }
            start++;
            end--;
        }
        if (ispalin == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static void palindromeCheck(String str) {
        int start = 0;
        int end = str.length() - 1;
        boolean ispalin = true;
        while (start < end) {// start==end
            if (str.charAt(start) != str.charAt(end)) {
                ispalin = false;
                break;
            }
            start++;
            end--;
        }
        if (ispalin == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}