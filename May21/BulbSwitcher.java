public class BulbSwitcher {
    public static void main(String[] args) {
        int n = 24;
        int ans = bulbSwitcher(n);
        System.out.println(ans);
    }

    public static int bulbSwitcher(int n) {
        // return type of Math.sqrt()->double
        int squarerootofn = (int) Math.sqrt(n);
        return squarerootofn;
    }
}