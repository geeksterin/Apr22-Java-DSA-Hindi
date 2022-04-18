import java.util.Scanner;

public class prime {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        boolean prime = true;
        for (int i = 2; i <= n - 1; i++) {
            if ((n % i) == 0) {
                prime = false;
                break;// no need tocheck further
            }
        }

        if (prime == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

}
