public class BulbSwitcher {
    public static void main(String[] args) {
        int n = 24;
        int ans = tribonacci(n);
        System.out.println(ans);
    }

    public static int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        if (n == 2) {
            return c;
        }
        for (int i = 0; i < n - 2; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}