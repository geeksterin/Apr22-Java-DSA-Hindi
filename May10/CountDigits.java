import java.util.Scanner;

public class CountDigits {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        int digit = countDigit(n);
        System.out.println(digit);
    }

    public static int countDigit(int n) {
        if (n == 0) {
            return 1;
        }
        int digit = 0;
        while (n != 0) {
            n = (n / 10);
            digit++;
        }
        return digit;
    }
}
