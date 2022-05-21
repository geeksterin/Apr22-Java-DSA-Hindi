public class HcfLcm {
    public static void main(String[] ars) {
        int a = 12;
        int b = 20;
        int h = hcf(a, b);
        int l = (a * b) / h;
        System.out.println("LCM is:" + l);
        System.out.println("HCF is:" + h);
    }

    public static int hcf(int a, int b) {
        while (a != b) {
            if (a > b) {// 14,4->10,4
                a = (a - b);
            } else {// 4,14->1,10
                b = (b - a);
            }
        }
        return a;
    }
}
