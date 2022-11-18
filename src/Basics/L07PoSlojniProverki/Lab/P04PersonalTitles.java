package Basics.L07PoSlojniProverki.Lab;
import java.util.Scanner;

public class P04PersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();

        if (gender.equals("m")) {
            if (num >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        } else if (gender.equals("f")) {
            if (num >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }

        }
    }
}