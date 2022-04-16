import java.util.Scanner;

public class logical {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter marks 1");
        int m1 = scn.nextInt();// marks of first student
        System.out.println("Enter marks 2");
        int m2 = scn.nextInt();// marks of second student

        if (m1 < 50 && m2 < 50) {
            System.out.println("Both are fail");
        } else if (m1 < 50 && m2 >= 50) {
            System.out.println("first is fail");
        } else if (m1 >= 50 && m2 < 50) {
            System.out.println("Second is fail");
        } else {
            System.out.println("Both are pass");
        }
    }
}
