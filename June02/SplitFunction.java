public class SplitFunction {
    public static void main(String[] args) {
        String str = "geekster#places#students";
        splitAndPrint(str);
    }

    public static void splitAndPrint(String str) {
        String[] arr = str.split("#");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}