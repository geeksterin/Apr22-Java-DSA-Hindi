import java.util.Scanner;

public class square {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int length = scn.nextInt();
        int breadth = scn.nextInt();
        if (length == breadth) {
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }

    }
}
