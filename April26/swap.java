import java.util.*;

public class swap {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();
        // SWAP VALUES OF A AND B
        // System.out.println(a + " " + b);
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println(a + " " + b);

        // SWAP VALUES OF A AND B without 3rd

        // a = a + b;
        // b = a - b;
        // a = a - b;
        // System.out.println(a + " " + b);

        // SINGLE LINE SWAP

        b = ((a + b) - (a = b));
        System.out.println(a + " " + b);

    }

}
