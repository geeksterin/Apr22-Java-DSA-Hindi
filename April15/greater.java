import java.util.Scanner;

public class greater {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (a > b) {
            System.out.println("A is greater");
        } else if(a==b) {
            System.out.println("Equal");
        }else{
            System.out.println("B is greater");
        }
    }
}
