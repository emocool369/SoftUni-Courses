package Exams.E15_16_06_2019;

import java.util.Scanner;

public class P04MovieStars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double actorsBudget = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();

        double budget = 0;
        double salaryActor = 0;

        int m = 1;

        while (!input.equals("ACTION")) {

            m += 1;
            int lengthName = input.length();

            if (lengthName <= 15) {
                salaryActor = Double.parseDouble(scan.nextLine());

            } else {
                if(m == 2){
                    salaryActor = actorsBudget * 0.2;
                } else {
                salaryActor = budget * 0.2;

                }
            }

            if (m == 2) {
                budget = actorsBudget - salaryActor;
            } else {
                budget = budget - salaryActor;
            }

            if (budget <= 0) {
                break;
            }

            input = scan.nextLine();

        }

        if (budget <= 0){
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.", budget);
        }
    }
}
