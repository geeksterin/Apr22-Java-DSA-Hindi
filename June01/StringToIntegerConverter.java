public class StringToIntegerConverter {
    public static void main(String[] args) {
        // String num = "1235";
        // num = num + 4;
        // System.out.println(num);
        // int num1 = Integer.parseInt(num);
        // num1 += 4;
        // System.out.println(num1);

        String str = "-8579";
        int num = parseInt(str);
        // num += 10;
        System.out.println(num);
    }

    public static int parseInt(String str) {
        int ans = 0;
        boolean neg = false;
        int i = 0;
        if (str.charAt(0) == '-') {
            neg = true;
            i = 1;
        }
        for (; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            ans = (ans * 10) + digit;
        }
        if (neg == true) {
            ans = -ans;
        }
        return ans;
    }
}