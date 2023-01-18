package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P7anotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double sum = 0;
        double price = 0;
        double sumbeverage = 0;

        while (!input.equals("Start")){
            double coin = Double.parseDouble(input);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1.0 || coin == 2.0){
                sum += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            input = scan.nextLine();
        }

        String beverage = scan.nextLine();

        while(!beverage.equals("End")){

            switch (beverage){
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
            }
            sumbeverage += price;

            if (sumbeverage > sum){
                System.out.println("Sorry, not enough money");
                sumbeverage -=price;

            } else if (beverage.equals("Coke") || beverage.equals("Soda") || beverage.equals("Crisps") || beverage.equals("Water") || beverage.equals("Nuts")) {
                System.out.printf("Purchased %s%n", beverage);

            }

            beverage = scan.nextLine();
        }

        System.out.printf("Change: %.2f", sum - sumbeverage);

    }
}
