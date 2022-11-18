package Exams.E22_10_2022;

import java.util.Scanner;

public class P02MaidenParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceParty = Double.parseDouble(scan.nextLine());
        int loveMessages = Integer.parseInt(scan.nextLine());
        int waxRoses = Integer.parseInt(scan.nextLine());
        int keyHolders = Integer.parseInt(scan.nextLine());
        int caricatures = Integer.parseInt(scan.nextLine());
        int luckSurprises = Integer.parseInt(scan.nextLine());

        double totalCost = (loveMessages * 0.60) + (waxRoses * 7.20) + (keyHolders * 3.60) + (caricatures * 18.20) + (luckSurprises * 22);

        int totalNumberArticles = loveMessages + waxRoses + keyHolders + caricatures + luckSurprises;

        if (totalNumberArticles >= 25){
            totalCost = totalCost - (totalCost * 0.35);

        }

        double expenseHosting = totalCost * 0.10;

        double profit = totalCost - expenseHosting;

        if (profit >= priceParty){
            System.out.printf("Yes! %.2f lv left.", profit - priceParty);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceParty - profit);
        }


    }

}
