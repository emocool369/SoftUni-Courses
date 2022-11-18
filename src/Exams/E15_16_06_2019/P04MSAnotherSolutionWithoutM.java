package Exams.E15_16_06_2019;

import java.util.Scanner;

public class P04MSAnotherSolutionWithoutM {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double actorsBudget = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();

        double salaryActor = 0;

        while (!input.equals("ACTION")) {

            int lengthName = input.length();

            if (lengthName > 15) {
                salaryActor = actorsBudget * 0.2;
            } else {
                salaryActor = Double.parseDouble(scan.nextLine());
            }
            actorsBudget -= salaryActor;

            if (actorsBudget <= 0) {
                break;
            }
            input = scan.nextLine();
        }
        if (actorsBudget <= 0) {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(actorsBudget));
        } else {
            System.out.printf("We are left with %.2f leva.", actorsBudget);
        }
    }
}

