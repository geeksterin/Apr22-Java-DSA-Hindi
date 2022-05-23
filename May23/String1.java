import javax.swing.plaf.synth.SynthSpinnerUI;

public class String1 {
    public static void main(String[] args) {
        String str = "mddscvgf,JBSDKYSV66645539998HMVSHGCjnbcgaiieef";
        System.out.println("Inbuilt function");
        countEverythingInb(str);
        System.out.println("Own functions");
        countEverythingOwn(str);
    }

    public static void countEverythingInb(String str) {
        int vc = 0;// vowel
        int dc = 0;// digit
        int lcc = 0;// lowercase
        int ucc = 0;// uppercase
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                lcc++;
            } else if (Character.isUpperCase(ch)) {
                ucc++;
            } else if (Character.isDigit(ch)) {
                dc++;
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
                    || ch == 'I' || ch == 'O' || ch == 'U') {
                vc++;
            }
        }
        System.out.println("LOWER: " + lcc);
        System.out.println("UPPER: " + ucc);
        System.out.println("VOWEL: " + vc);
        System.out.println("DIGIT: " + dc);

    }

    public static void countEverythingOwn(String str) {
        int vc = 0;// vowel
        int dc = 0;// digit
        int lcc = 0;// lowercase
        int ucc = 0;// uppercase\

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isUpper(ch)) {
                ucc++;
            } else if (isLower(ch)) {
                lcc++;
            } else if (isDigit(ch)) {
                dc++;
            }

            if (isVowel(ch)) {
                vc++;
            }
        }

        System.out.println("LOWER: " + lcc);
        System.out.println("UPPER: " + ucc);
        System.out.println("VOWEL: " + vc);
        System.out.println("DIGIT: " + dc);
    }

    public static boolean isUpper(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return true;
        }
        return false;
    }

    public static boolean isLower(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return true;
        }
        return false;
    }

    public static boolean isDigit(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
                || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
