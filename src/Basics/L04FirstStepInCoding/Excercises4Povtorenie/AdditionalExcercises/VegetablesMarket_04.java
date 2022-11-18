package Basics.L04FirstStepInCoding.Excercises4Povtorenie.AdditionalExcercises;

import java.util.Scanner;

public class VegetablesMarket_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceVeggies = Double.parseDouble(scan.nextLine());
        double priceFruits = Double.parseDouble(scan.nextLine());
        double totalKgVeggies = Double.parseDouble(scan.nextLine());
        double totalKgFruits = Double.parseDouble(scan.nextLine());

        double sumVeggies = priceVeggies * totalKgVeggies;
        double sumKgFruits = priceFruits * totalKgFruits;

        double totalSuminLv = sumVeggies + sumKgFruits;

        double totalSuminEUR = totalSuminLv / 1.94;

        System.out.printf("%.2f", totalSuminEUR);

    }
}
