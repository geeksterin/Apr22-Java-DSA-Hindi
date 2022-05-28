public class Anagram {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heaet";
        isAnagram(str1, str2);
    }

    public static void isAnagram(String str1, String str2) {
        int[] fmap1 = createFrequenyMap(str1);
        int[] fmap2 = createFrequenyMap(str2);
        boolean anagram = true;
        for (int i = 0; i < 256; i++) {
            if (fmap1[i] != fmap2[i]) {
                anagram = false;
                break;
            }
        }
        if (anagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }

    public static int[] createFrequenyMap(String str) {
        int len = str.length();
        int[] fmap = new int[256];
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            fmap[ch]++;
        }
        return fmap;
    }
}