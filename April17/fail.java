import java.util.Scanner;

public class fail {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int m1 = scn.nextInt();
        int m2 = scn.nextInt();
        int m3 = scn.nextInt();
        if (m1 < 50 || m2 < 50 || m3 < 50) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }
    }

}
