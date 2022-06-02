public class SumOfSubString {
    public static void main(String[] args) {
        String str = "12345";
        int ans = sumOfAllSubstring(str);
        System.out.println(ans);
    }

    public static int sumOfAllSubstring(String str) {
        int sum = 0;
        int n = str.length();
        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                String substring = str.substring(start, end);// O(n)
                int val = Integer.parseInt(substring);
                sum += val;
            }
        }
        return sum;
    }
}