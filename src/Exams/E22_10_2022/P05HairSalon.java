package Exams.E22_10_2022;

import java.util.Scanner;

public class P05HairSalon {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dayTarget = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int incomeMens = 0;
        int incomeLadies = 0;
        int incomeKids= 0;
        int incomeTouchUp = 0;
        int incomeFullColor = 0;
        int totalIncome = 0;

        while(!input.equals("closed")){


            switch (input){
                case "haircut":
                    input = scan.nextLine();
                    if (input.equals("mens")){
                        incomeMens += 15;
                    } else if (input.equals("ladies")){
                        incomeLadies += 20;
                    } else if (input.equals("kids")){
                        incomeKids += 10;
                    }
                    break;
                case "color":
                    input = scan.nextLine();
                    if (input.equals("touch up")){
                        incomeTouchUp += 20;
                    } else if (input.equals("full color")){
                        incomeFullColor += 30;
                    }
                    break;
            }

            totalIncome = incomeMens + incomeLadies + incomeKids + incomeTouchUp + incomeFullColor;

            if (totalIncome >= dayTarget){
                System.out.printf("You have reached your target for the day!%n");
                System.out.printf("Earned money: %dlv.", totalIncome);

                break;
            }


            input = scan.nextLine();
        }
        if (totalIncome < dayTarget){
            System.out.printf("Target not reached! You need %dlv. more.%n", dayTarget - totalIncome);
            System.out.printf("Earned money: %dlv.", totalIncome);
        }

    }

}
