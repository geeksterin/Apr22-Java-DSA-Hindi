public class StrongPass {
    public static void main(String[] args) {
        String str = "jahdggG5";
        String ans = getResult(str);
        System.out.println(ans);
    }

    public static String getResult(String str) {
        boolean lengthOk = false;
        boolean upperOk = false;
        boolean lowerOk = false;
        boolean digitOk = false;
        boolean specialOk = false;

        if (str.length() > 8) {
            lengthOk = true;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lowerOk = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                upperOk = true;
            } else if (ch >= '0' && ch <= '9') {
                digitOk = true;
            } else {
                specialOk = true;
            }
        }

        if (lengthOk && upperOk && lowerOk && digitOk && specialOk) {
            return "Strong Password!";
        }

        // if (lengthOk == false) {
        // System.out.println("Enter atleaset 8 chars");
        // }
        // if (upperOk == false) {
        // System.out.println("Use Atleast 1 upper case character");
        // }

        return "Weak Password";
    }
}