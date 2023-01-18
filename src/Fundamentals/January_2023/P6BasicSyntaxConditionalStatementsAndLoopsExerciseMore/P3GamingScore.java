package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExerciseMore;

import java.util.Scanner;

//даваше 60/100 докато не сложих да се отпечатва името на играта във всеки суитч кейс

public class P3GamingScore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scan.nextLine());
        double originalBalance = currentBalance;
        double price = 0.0;
        String input = scan.nextLine();
        String nameOfTheGame = "";


        while (!input.equals("Game Time")) {


            if (currentBalance == 0) {
                System.out.println("Out of money!");
                break;
            }

            switch (input) {
                case "OutFall 4":
                    price = 39.99;
                    if (currentBalance < price && price > 0) {
                        System.out.println("Too Expensive");
                        break;
                    } else if (currentBalance >= price && price > 0){
                        currentBalance = currentBalance - price;
                        nameOfTheGame = "OutFall 4";
                        System.out.println("Bought " + nameOfTheGame);

                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    if (currentBalance < price && price > 0) {
                        System.out.println("Too Expensive");
                        break;
                    } else if (currentBalance >= price && price > 0) {
                        currentBalance = currentBalance - price;
                        nameOfTheGame = "CS: OG";
                        System.out.println("Bought " + nameOfTheGame);
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (currentBalance < price && price > 0) {
                        System.out.println("Too Expensive");
                        break;
                    } else if (currentBalance >= price && price > 0){
                        currentBalance = currentBalance - price;
                        nameOfTheGame = "Zplinter Zell";
                        System.out.println("Bought " + nameOfTheGame);
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (currentBalance < price && price > 0) {
                        System.out.println("Too Expensive");
                        break;
                    } else if (currentBalance >= price && price > 0){
                        currentBalance = currentBalance - price;
                        nameOfTheGame = "Honored 2";
                        System.out.println("Bought " + nameOfTheGame);
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (currentBalance < price && price > 0) {
                        System.out.println("Too Expensive");
                        break;
                    } else if (currentBalance >= price && price > 0){
                        currentBalance = currentBalance - price;
                        nameOfTheGame = "RoverWatch";
                        System.out.println("Bought " + nameOfTheGame);
                    }
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if (currentBalance < price && price > 0) {
                        System.out.println("Too Expensive");
                        break;
                    } else if (currentBalance >= price && price > 0) {
                        currentBalance = currentBalance - price;
                        nameOfTheGame = "RoverWatch Origins Edition";
                        System.out.println("Bought " + nameOfTheGame);
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }


            input = scan.nextLine();
        }
        if (currentBalance > 0) {
            double spentMoney = originalBalance - currentBalance;
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentMoney, currentBalance);
        }
    }
}
