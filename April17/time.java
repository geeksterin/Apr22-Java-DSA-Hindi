import java.util.Scanner;

public class time {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter time");
        int time = scn.nextInt();
        // if (time < 12) {
        // System.out.println("Good Morning");
        // } else if (time <= 16) {
        // System.out.println("Good Afternoon");
        // } else if (time <= 20) {
        // System.out.println("Good Evening");
        // } else {
        // System.out.println("Good Night");
        // }

        if (time < 12) {
            System.out.println("Good morning");
        } else {
            if (time <= 16) {
                System.out.println("Good Afternoon");
            } else {
                if (time <= 20) {
                    System.out.println("Good Evening");
                } else {
                    System.out.println("Good night");
                }
            }
        }
    }

}
