import java.util.*;

public class test1 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int marks = scn.nextInt();
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
