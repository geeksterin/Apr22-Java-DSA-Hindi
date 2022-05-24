import javax.swing.plaf.synth.SynthSpinnerUI;

public class StringFunc {
    public static void main(String[] args) {
        // int[] arr1=new int[5];
        // int[] arr2=new int[5];
        // System.out.println(arr1==arr2);//false

        // String s1="Hello";
        // String s2="Hello";
        // System.out.println(s1==s2);

        // String s1 = new String("Hello");
        // String s2 = new String("Hello");
        // System.out.println(s1==s2);
        // boolean same = true;
        // for (int i = 0; i < s1.length(); i++) {
        // if (s1.charAt(i) != s2.charAt(i)) {
        // same = false;
        // break;
        // }
        // }
        // if (same) {
        // System.out.println(true);
        // } else {
        // System.out.println(false);
        // }

        // boolean same = s1.equals(s2);// check the internal data of string
        // System.out.println(same);

        String s1 = new String("aeroplane");
        String s2 = new String("Apple");
        int d = s1.compareTo(s2);
        System.out.println(d);
        if (d < 0) {
            System.out.println("s1<s2");
        } else if (d > 0) {
            System.out.println("s2<s1");
        } else {
            System.out.println("Both are same");
        }
    }
}