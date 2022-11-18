package Basics.L05Proverki.P06Excercises;

import java.util.Scanner;

public class P05GodzillavsKong {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scan.nextLine());
        int statists = Integer.parseInt(scan.nextLine());
        double priceClothes = Double.parseDouble(scan.nextLine());

        double movieDecor = movieBudget * 0.1;
        double allClothesPrice = statists * priceClothes;

        if (statists > 150){

            allClothesPrice = allClothesPrice * 0.9;
        }

        double neededMoney = allClothesPrice + movieDecor;

        if (movieBudget >= neededMoney){

            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", movieBudget - neededMoney);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", neededMoney - movieBudget);
        }

    }

}
