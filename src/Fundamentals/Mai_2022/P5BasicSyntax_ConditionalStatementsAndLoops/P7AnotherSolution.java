package Fundamentals.Mai_2022.P5BasicSyntax_ConditionalStatementsAndLoops;

import java.util.Scanner;

public class P7AnotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());

        boolean isNotValid = false;
        int ticketPrice = 0;

        if (age >= 0 && age <= 18) {
            if (day.equals("Weekday")) {
                ticketPrice = 12;
            } else if (day.equals("Weekend")) {
                ticketPrice = 18;
            } else if (day.equals("Holiday")) {
                ticketPrice = 12;
            }
        } else if (age > 18 && age <= 64) {
            if (day.equals("Weekday")) {
                ticketPrice = 15;
            } else if (day.equals("Weekend")) {
                ticketPrice = 20;
            } else if (day.equals("Holiday")) {
                ticketPrice = 15;
            }

        } else if (age > 64 && age <= 122) {
            if (day.equals("Weekday")) {
                ticketPrice = 5;
            } else if (day.equals("Weekend")) {
                ticketPrice = 12;
            } else if (day.equals("Holiday")) {
                ticketPrice = 10;
            }
        } else {
            isNotValid = true;
        }
        if (isNotValid) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", ticketPrice);
        }
    }
}
