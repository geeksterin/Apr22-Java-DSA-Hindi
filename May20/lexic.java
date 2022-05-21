import java.util.Arrays;

public class lexic {
    public static void main(String[] args) {
        // a->97
        // A->65
        String[] arr = { "Apple", "aeroplane", "Application", "Bat", "Ball" };
        Arrays.sort(arr);
        // for (String s : arr) {
        // System.out.print(s + " ");
        // }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}