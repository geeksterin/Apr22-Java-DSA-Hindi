import java.util.*;

public class test2 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scn.nextInt();
        int steps = 0;
        // for(intitialization;condition;increament)
        // for (; N != 0;) {
        // if (N % 2 == 0) {// n is even
        // N = (N / 2);
        // } else {
        // N = (N - 1);
        // }
        // steps++;
        // }
        // System.out.println(steps);

        while (N > 0) {
            if (N % 2 == 0) {// n is even
                N = (N / 2);
            } else {
                N = (N - 1);
            }
            steps++;
        }

    }
}
