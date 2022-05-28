public class Panagram {
    public static void main(String[] args) {
        String str = "abcddddddddddefghijklmnopqrstuvwxyz";
        isPanagram(str);
    }

    public static void isPanagram(String str) {
        for (int i = 'a'; i <= 'z'; i++) {
            char ch = (char) i;
            boolean isPresent = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    isPresent = true;
                    break;
                }
            }
            if (isPresent == false) {
                System.out.println("Not A panagram");
                return;
            }
        }

        System.out.println("Panagram");
    }
}