import java.util.Scanner;

public class tableofseven {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 7; i <= 70; i += 7) {
            System.out.print(i + " ");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print((i * 7) + " ");
        }
    }
}
