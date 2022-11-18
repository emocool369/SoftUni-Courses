package Basics.L07PoSlojniProverki.Lab;

import java.util.Scanner;

public class P02WeekendorWorkingDay1Advanced {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Working day");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Error");
        }
    }
}
