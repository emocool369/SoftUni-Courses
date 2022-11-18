package Exams.E28_29_2020;

import java.util.Scanner;

public class P03FitnessCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double availableAmountMoney = Double.parseDouble(scan.nextLine());
        String sex = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String Sport = scan.nextLine();

        double priceSport = 0.0;

        if(sex.equals("m")){
            switch (Sport) {
                case "Gym":
                    priceSport = 42;
                    break;
                case "Boxing":
                    priceSport = 41;
                    break;
                case "Yoga":
                    priceSport = 45;
                    break;
                case "Zumba":
                    priceSport = 34;
                    break;
                case "Dances":
                    priceSport = 51;
                    break;
                case "Pilates":
                    priceSport = 39;
                    break;
            }
            } else if (sex.equals("f")) {
            switch (Sport) {
                case "Gym":
                    priceSport = 35;
                    break;
                case "Boxing":
                    priceSport = 37;
                    break;
                case "Yoga":
                    priceSport = 42;
                    break;
                case "Zumba":
                    priceSport = 31;
                    break;
                case "Dances":
                    priceSport = 53;
                    break;
                case "Pilates":
                    priceSport = 37;
                    break;
            }

            }




        if (age <= 19){
            priceSport = priceSport * 0.8;
        }

        if (availableAmountMoney >= priceSport){
            System.out.printf("You purchased a 1 month pass for %s.", Sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", priceSport - availableAmountMoney);
        }
    }
}
