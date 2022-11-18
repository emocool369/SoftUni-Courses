package Basics.L04FirstStepInCoding.Excercises4Povtorenie;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberChickenMenus = Integer.parseInt(scan.nextLine());
        int numberFishMenus = Integer.parseInt(scan.nextLine());
        int numberVeggieMenus = Integer.parseInt(scan.nextLine());

        double priceChickenMenus = numberChickenMenus * 10.35;
        double priceFishMenus = numberFishMenus * 12.40;
        double priceVeggieMenus = numberVeggieMenus * 8.15;

        double totalPriceMenus = priceChickenMenus + priceFishMenus + priceVeggieMenus;

        double discountDessert = totalPriceMenus * 0.2;

        double priceDelivery = 2.50;

        double totalAmount = totalPriceMenus + discountDessert + priceDelivery;

        System.out.println(totalAmount);


    }

}
