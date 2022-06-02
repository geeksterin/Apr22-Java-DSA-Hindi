public class ReverseWords {
    public static void main(String[] args) {
        String str = "geekster     places";
        reverse(str);
    }

    public static void reverse(String str) {
        String[] arr = str.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}