import java.util.Scanner;

public class biodata {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter name:");
        String name = scn.nextLine();
        System.out.println();
        System.out.print("Enter Age:");
        String age = scn.nextLine();
        System.out.println();
        System.out.print("Enter DOB:");
        String dob = scn.nextLine();
        System.out.println();
        System.out.print("Enter Qualification:");
        String degree = scn.nextLine();
        System.out.println();
        System.out.print("Enter Address:");
        String address = scn.nextLine();
        System.out.println();
        System.out.print("Enter Contact:");
        String contact = scn.nextLine();

        System.out.println("Name \t:\t" + name);
        System.out.println("Age \t:\t" + age);
        System.out.println("Date Of birth \t:\t" + dob);
        System.out.println("Qualification \t:\t" + degree);
        System.out.println("Address \t:\t" + address);
        System.out.println("Contact \t:\t" + contact);

    }

}
