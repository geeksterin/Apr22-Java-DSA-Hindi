import java.util.Scanner;

public class ReverseNumber {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        int ans = reverseNumber(n);
        System.out.println(ans);
    }

    public static int reverseNumber(int n) {
        int ans = 0;
        while (n != 0) {
            int lastdigit = (n % 10);
            n = (n / 10);
            ans = (ans * 10) + lastdigit;
            // System.out.println(lastdigit);
        }
        return ans;
    }
}
