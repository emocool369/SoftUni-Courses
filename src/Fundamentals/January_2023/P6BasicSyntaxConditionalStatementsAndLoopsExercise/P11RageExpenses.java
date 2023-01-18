package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P11RageExpenses {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int count = 0;
        int countK = 0;
        int countD = 0;
        double numberLostGames = 0;
        double totalCostHS = 0;
        double totalCostM = 0;
        double totalCostK = 0;
        double totalCostD = 0;
        double totalCost = 0;

        if(lostGamesCount >= 2){
            numberLostGames = Math.floor(lostGamesCount / 2.0);
            totalCostHS = numberLostGames * headsetPrice;
            count = lostGamesCount / 2;
        }

        if (lostGamesCount >= 3){
            numberLostGames = Math.floor(lostGamesCount / 3.0);
            totalCostM = numberLostGames * mousePrice;
        }

        if(count >= 3){
            countK = count / 3;
            totalCostK = countK * keyboardPrice;
        }

        if(countK >= 2){
            countD = countK / 2;
            totalCostD = countD * displayPrice;
        }

        totalCost = totalCostHS + totalCostM + totalCostK + totalCostD;

        System.out.printf("Rage expenses: %.2f lv.", totalCost);

    }
}