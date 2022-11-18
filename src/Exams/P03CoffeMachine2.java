package Exams;

import java.util.Scanner;

public class P03CoffeMachine2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String drink = new String(scan.nextLine());
        String sugar = new String(scan.nextLine());
        int drinks = Integer.parseInt(scan.nextLine());

        double totalPrice = 0;

        if (drink.equals("Espresso") && sugar.equals("Without")) {
            //35 % отстъпка
            // мин 5 броя = 25 % отстъпка
            // крайна сума по-голяма от 15 лева, 20 % отстъпка от крайна цена
            totalPrice = (drinks * 0.9) * 0.65;

            if (drinks >= 5 && totalPrice > 15) {

                double totalPrice2 = (totalPrice * 0.75) * 0.8;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            } else if (drinks >= 5 && totalPrice <= 15) {

                double totalPrice2 = totalPrice * 0.75;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);
            } else if (drinks < 5) {

                double totalPrice2 = totalPrice;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);
            }

        } else if (drink.equals("Espresso") && sugar.equals("Normal")) {
            // мин 5 броя = 25 % отстъпка
            // крайна сума по-голяма от 15 лева, 20 % отстъпка от крайна цена
            totalPrice = drinks * 1;

            if (drinks >= 5 && totalPrice > 15) {

                double totalPrice2 = totalPrice * 0.75;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            } else if (drinks >= 5 && totalPrice <= 15) {

                double totalPrice2 = totalPrice * 0.75;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);
            } else if (drinks < 5 && totalPrice <= 15) {

                double totalPrice2 = totalPrice;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);
            }

        } else if (drink.equals("Espresso") && sugar.equals("Extra")) {
            // мин 5 броя = 25 % отстъпка
            // крайна сума по-голяма от 15 лева, 20 % отстъпка от крайна цена

            totalPrice = drinks * 1.2;

            if (drinks >= 5 && totalPrice > 15) {

                double totalPrice2 = (totalPrice * 0.75) * 0.8;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            } else if (drinks >= 5 && totalPrice <= 15) {

                double totalPrice2 = totalPrice * 0.75;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);
            } else if (drinks < 5) {

                double totalPrice2 = totalPrice;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);
            }

        } else if (drink.equals("Cappuccino") && sugar.equals("Without")) {
            //35 % отстъпка
            // крайна сума по-голяма от 15 лева, 20 % отстъпка от крайна цена

            totalPrice = (drinks * 1) * 0.65;

            if (totalPrice > 15) {

                double totalPrice2 = (totalPrice) * 0.8;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            } else if (totalPrice <= 15) {

                double totalPrice2 = totalPrice;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            }

        } else if (drink.equals("Cappuccino") && sugar.equals("Normal")) {
            // крайна сума по-голяма от 15 лева, 20 % отстъпка от крайна цена
            totalPrice = drinks * 1.2;

            if (totalPrice > 15) {

                double totalPrice2 = (totalPrice) * 0.8;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            } else if (totalPrice <= 15) {

                double totalPrice2 = totalPrice;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            }

        } else if (drink.equals("Cappuccino") && sugar.equals("Extra")) {
            // крайна сума по-голяма от 15 лева, 20 % отстъпка от крайна цена
            totalPrice = drinks * 1.6;

            if (totalPrice > 15) {

                double totalPrice2 = (totalPrice) * 0.8;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            } else if (totalPrice <= 15) {

                double totalPrice2 = totalPrice;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            }


        } else if (drink.equals("Tea") && sugar.equals("Without")) {
            //35 % отстъпка
            // крайна сума по-голяма от 15 лева, 20 % отстъпка от крайна цена
            totalPrice = (drinks * 0.5) * 0.65;

            if (totalPrice > 15) {

                double totalPrice2 = (totalPrice) * 0.8;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            } else if (totalPrice <= 15) {

                double totalPrice2 = totalPrice;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            }

        } else if (drink.equals("Tea") && sugar.equals("Normal")) {
            // крайна сума по-голяма от 15 лева, 20 % отстъпка от крайна цена
            totalPrice = drinks * 0.6;

            if (totalPrice > 15) {

                double totalPrice2 = (totalPrice) * 0.8;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            } else if (totalPrice <= 15) {

                double totalPrice2 = totalPrice;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            }

        } else if (drink.equals("Tea") && sugar.equals("Extra")) {
            // крайна сума по-голяма от 15 лева, 20 % отстъпка от крайна цена

            totalPrice = drinks * 0.7;
            if (totalPrice > 15) {

                double totalPrice2 = (totalPrice) * 0.8;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            } else if (totalPrice <= 15) {

                double totalPrice2 = totalPrice;

                System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drink, totalPrice2);

            }


        }

    }
}
