import java.util.Scanner;

public class TypeCasting {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // int a = scn.nextInt();
        // int b = scn.nextInt();

        // IMPLICIT TYPE CASTING
        // int a=3;
        // long b=a;
        // System.out.println(b);

        // EXPLICIT TYPE CASTING
        long a = Long.MAX_VALUE - 1000;
        System.out.println(a);
        int b = (int) a;
        System.out.println(b);

    }

}