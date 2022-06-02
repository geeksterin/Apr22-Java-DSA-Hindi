
public class SubstringWithoutVowel {
    public static void main(String[] args) {
        String str = "geekster";
        int ans = withoutVowel(str);
        System.out.println(ans);
    }

    public static int withoutVowel(String str) {
        int count = 0;
        int n = str.length();
        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                String substring = str.substring(start, end);
                boolean ispresent = isVowelPresent(substring);
                if (ispresent == false) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static boolean isVowelPresent(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                return true;
            }
        }
        return false;
    }
}