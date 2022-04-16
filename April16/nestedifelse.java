import java.util.Scanner;

public class nestedifelse {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter marks 1");
        int m1 = scn.nextInt();// marks of first student
        System.out.println("Enter marks 2");
        int m2 = scn.nextInt();// marks of second student
        if (m1 < 50) {// m1->fail
            if (m2 < 50) {// m2-> fail
                System.out.println("Both are fail");
            } else {// m2->pass
                System.out.println("student 1 is fail");
            }
        } else {// m1>->pass
            if (m2 < 50) {// m2->fail
                System.out.println("Sudent 2 is fail");

            } else {// m2->pass
                System.out.println("Both are pass");
            }
        }
    }
}
