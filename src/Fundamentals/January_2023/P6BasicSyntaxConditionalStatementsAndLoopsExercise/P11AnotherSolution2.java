package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P11AnotherSolution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        double price = 0.0;

        for (int i = 1; i <= lostGames; i++) {

            if (i % 2 == 0) {
                price = price + headsetPrice;
            }
            if (i % 3 == 0) {
                price = price + mousePrice;
            }
            if (i % 6 == 0) {
                price = price + keyboardPrice;
            }
            if (i % 12 == 0) {
                price = price + displayPrice;
            }

        }
        System.out.printf("Rage expense: %.2f lv.", price);
    }
}