package Basics.L11WhileCicle.P12WhileCicleExercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double vacationCost = Double.parseDouble(scan.nextLine());
        double availableCash = Double.parseDouble(scan.nextLine());

        int allDays = 0;
        int spendDays = 0;

        while (availableCash < vacationCost && spendDays < 5) {
            String action = scan.nextLine(); //spend,save
            double cash = Double.parseDouble(scan.nextLine()); // сумата, която ще спести или похарчи

            allDays++;

            if (action.equals("spend")) {
                availableCash = availableCash - cash; // от моите пари, вадя сумата, която се харчи
                spendDays++; // увеличавам дните в които Джеси харчи
                if (availableCash < 0) { //ако моите пари са по малко от 0, наличните пари са равни на 0
                    availableCash = 0;
                }
            } else if (action.equals("save")) {
                availableCash = availableCash + cash;
                spendDays = 0;
            }

        }
        if (availableCash >= vacationCost){
            System.out.printf("You saved the money for %d days.", allDays);
        }
        if (spendDays == 5){
            System.out.println("You can't save the money.");
            System.out.printf("%d", allDays);
        }

    }
}
