import java.util.Scanner;

public class arrayinput {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter size of array");
        // INPUT SIZE
        int size = scn.nextInt();

        // ARRAY INITIALIZE
        int[] arr = new int[size];

        System.out.print("Enter values in array");
        // FILL ARRAY USING INPUT
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        // PRINT ARRAY
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
