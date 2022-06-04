
public class FirstNonRep {
    public static void main(String[] args) {
        String str = "";
        char ans = firstNonRepeating(str);
        System.out.println(ans);
    }

    public static char firstNonRepeating(String str) {
        int[] fmap = createMap(str);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (fmap[ch - 'a'] == 1) {
                return ch;
            }
        }
        return ' ';
    }

    public static int[] createMap(String str) {
        int[] fmap = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            fmap[ch - 'a']++;
        }
        return fmap;
    }

}