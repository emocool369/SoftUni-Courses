package Exams.E29_10_2022;
import java.util.Scanner;
public class P01MiningRig {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int priceOneVideoCard = Integer.parseInt(scan.nextLine());
        int priceOnePrehodnik = Integer.parseInt(scan.nextLine());
        double priceConsumatedElectricityPerCardPerDay = Double.parseDouble(scan.nextLine());
        double winPerCardPerDay = Double.parseDouble(scan.nextLine());

        int totalPriceVideoCards = priceOneVideoCard * 13;
        int totalPricePrehodnizi = priceOnePrehodnik * 13;

        int totalMoneySpent = totalPriceVideoCards + totalPricePrehodnizi + 1000;

        double nettoWinPerCardPerDay = winPerCardPerDay - priceConsumatedElectricityPerCardPerDay;

        double totalWinCardsPerDay = 13 * nettoWinPerCardPerDay;

        double dayROI = totalMoneySpent / totalWinCardsPerDay;

        System.out.println(totalMoneySpent);
        System.out.printf("%.0f", Math.ceil(dayROI));

    }
}
