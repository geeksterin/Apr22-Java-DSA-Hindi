import java.util.Scanner;

public class UserInput {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        while (scn.hasNext()) {
            System.out.println(scn.next());
        }
    }
}