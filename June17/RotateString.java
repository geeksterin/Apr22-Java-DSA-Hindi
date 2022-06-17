public class RotateString {
    public static void main(String[] args) {
        String s = "";
        String goal = "";
        boolean ans = rotateSame(s, goal);
        System.out.println(ans);
    }

    public static boolean rotateSame(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] s2 = goal.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            rotate(s1);
            boolean issame = compare(s1, s2);
            if (issame) {
                return true;
            }
        }
        return false;
    }

    public static void rotate(char[] s1) {
        char temp = s1[0];
        for (int i = 0; i < s1.length - 1; i++) {
            s1[i] = s1[i + 1];
        }
        s1[s1.length - 1] = temp;
    }

    public static boolean compare(char[] s1, char[] s2) {
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }

    // OPTIMIZED
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String dup = s + s;// O(s.length())
        if (dup.contains(goal)) {// O(s.length()+goal.length())
            return true;
        }
        return false;
    }
}