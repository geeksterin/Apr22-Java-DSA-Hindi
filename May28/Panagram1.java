public class Panagram1 {
    public static void main(String[] args) {
        String str = "abcddddddddddefghijklnopqrstuvwxyz";
        isPanagram(str);
    }

    public static void isPanagram(String str) {

        int[] fmap = createFrequenyMap(str);//O(n)

        for (int i = 'a'; i <= 'z'; i++) {//O(26)
            if (fmap[i] == 0) {
                System.out.println("Not a Panagram");
                return;
            }
        }

        System.out.println("Panagram");
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