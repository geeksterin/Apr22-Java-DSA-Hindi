public class AllSubString {
    public static void main(String[] args) {
        String str = "star";
        printAllSubstring(str);
    }

    public static void printAllSubstring(String str) {
        int n = str.length();
        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                String substring = str.substring(start, end);
                System.out.println(substring);
            }
        }
    }
}