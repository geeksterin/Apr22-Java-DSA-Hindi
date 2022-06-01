public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaabbbbbbbbbbbbbbgggggggghhhhhhhhhhhhhhdgggggggggsdasasarstsgdhgj";
        String ans = removeDuplicacy(str);
        System.out.println(ans);
    }

    public static String removeDuplicacy(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] used = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            if (used[index] == false) {
                sb.append(ch);
                used[index] = true;
            }
        }
        return sb.toString();
    }
}