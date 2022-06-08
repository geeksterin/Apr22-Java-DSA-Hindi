import java.util.Scanner;

public class MathsFunc {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // int a = scn.nextInt();
        // int b = scn.nextInt();
        // MAX FUNCTION
        // int max = Math.max(a, b);
        // int max = max(a, b);
        // System.out.println("Max between a and b is : " + max);

        // MIN FUNCTION
        // int min = Math.min(a, b);
        // int min = min(a, b);
        // System.out.println("Min between a and b is : " + min);

        // POWER FUNCTION
        // double pow=Math.pow(a,b);
        // long start = System.currentTimeMillis();
        // double pow = pow(a, b);
        // long end = System.currentTimeMillis();
        // long t1 = (end - start);
        // System.out.println("Time 1: " + t1);
        // System.out.println("A to the power b is " + pow);

        // System.out.println("-----------------");

        // start = System.currentTimeMillis();
        // pow = Math.pow(a, b);
        // end = System.currentTimeMillis();
        // long t2 = (end - start);
        // System.out.println("Time 2: " + t2);
        // System.out.println("A to the power b is " + pow);

        // SQUARE ROOT FUNCTION
        // long start = System.currentTimeMillis();
        // double sqrt = sqrt(a);
        // long end = System.currentTimeMillis();
        // long t1 = (end - start);
        // System.out.println("Time 1: " + t1);
        // System.out.println("Sqrt of a is : " + sqrt);

        // System.out.println("-----------------");

        // start = System.currentTimeMillis();
        // sqrt = sqrtOptimized(a);
        // end = System.currentTimeMillis();
        // long t2 = (end - start);
        // System.out.println("Time 2: " + t2);
        // System.out.println("Sqrt of a is : " + sqrt);

        // FLOOR
        // double a = scn.nextDouble();
        // double floor = Math.floor(a);
        // System.out.println("Floor of a is : " + floor);
        // double ceil = Math.ceil(a);
        // System.out.println("Ceil of a is : " + ceil);

        // double a = scn.nextDouble();
        // double floor = floor(a);
        // System.out.println("Floor of a is : " + floor);
        // double ceil = ceil(a);
        // System.out.println("Ceil of a is : " + ceil);

        int a = scn.nextInt();
        System.out.println(isPrime(a));

    }

    public static int max(int a, int b) {
        // if (a >= b) {
        // return a;
        // }
        // return b;
        return (a >= b ? a : b);
    }

    public static int min(int a, int b) {
        // if (a <= b) {
        // return a;
        // }
        // return b;
        return (a <= b ? a : b);
    }

    // pow(3,5)->1*3*3*3*3*3
    // Time->O(n)
    // RECURSION ->log(n)
    public static double pow(double a, double b) {
        double ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        return ans;
    }

    // (O(a))
    public static double sqrt(double a) {
        for (double i = 1; i <= a; i++) {
            if (i * i == a) {
                return i;
            }
        }
        return -1;
    }

    // O(sqrt(a))
    public static double sqrtOptimized(double a) {
        for (double i = 1; (i * i) <= a; i++) {
            if (i * i == a) {
                return i;
            }
        }
        return -1;
    }

    public static int floor(double a) {
        return (int) a;
    }

    // 3->3
    // 3.4->3(floor)
    public static int ceil(double a) {
        int floor = floor(a);
        // if (floor == a) {
        // return (int) a;
        // } else {
        // return (int) (a + 1);
        // }

        return (int) ((floor == a) ? a : (a + 1));
    }

    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}