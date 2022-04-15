import java.util.Scanner;

public class reportcard {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int marks = scn.nextInt();

        if (marks > 90) {
            System.out.println("A grade");
        } else if (marks > 70) {
            System.out.println("B grade");
        } else if (marks > 50) {
            System.out.println("C grade");
        } else {
            System.out.println("D grade");
        }

    }
}
