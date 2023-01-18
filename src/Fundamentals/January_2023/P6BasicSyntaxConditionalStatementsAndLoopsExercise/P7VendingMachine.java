package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P7VendingMachine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String coins = scan.nextLine();
        double totalCoins = 0;
        double restMoney = 0;
        double price = 0;
        boolean isValid = true;

        while (!coins.equals("Start")) {
            double makeCoins = Double.parseDouble(coins);

            if (makeCoins == 0.1 || makeCoins == 0.2 || makeCoins == 0.5 || makeCoins == 1 || makeCoins == 2) {
                totalCoins = totalCoins + makeCoins;
                restMoney = totalCoins;
            } else {
                System.out.printf("Cannot accept %.2f%n", makeCoins);
            }

            coins = scan.nextLine();

        }

        String purchase = scan.nextLine();

        while (!purchase.equals("End")) {
            switch (purchase) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    isValid = false;
                    break;

            }

            if(price <= restMoney && restMoney != 0.0 && isValid){ //- 85/11 в джъдж, когато не проверявам, тук, дали напитката е валидна
                restMoney = restMoney - price;
                System.out.printf("Purchased %s%n", purchase);
            }else if(isValid && restMoney < price){
                System.out.println("Sorry, not enough money");
            }
            purchase = scan.nextLine();
        }

        System.out.printf("Change: %.2f", restMoney);

    }
}
