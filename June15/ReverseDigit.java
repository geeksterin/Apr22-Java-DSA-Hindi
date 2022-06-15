public class ReverseDigit {
    public static void main(String[] args) {
        // int[] arr=new int[1000000000];
        int n = Integer.MAX_VALUE;
        // System.out.println(n%10);
        // int ans = reverseDigits(n);
        long ans = reverseDigits_(n);
        if (ans <= Integer.MAX_VALUE && ans >= Integer.MIN_VALUE) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }

    public static int reverseDigits(int n) {
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;// digit
            n = n / 10;
            ans = ans * 10 + rem;
        }
        return ans;
    }

    public static long reverseDigits_(int n) {
        long ans = 0;
        while (n != 0) {
            int rem = n % 10;// digit
            n = n / 10;
            ans = (ans * 10) + rem;
        }
        return ans;
    }
}