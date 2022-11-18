package Exams.E28_29_2020;

import java.util.Scanner;

public class P06TournamentOfChristmas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());


        double raisedMoney = 0;
        double totalRaisedMoney = 0;
        int numberWonGames = 0;
        int numberLostGames = 0;
        int daysWon = 0;
        int daysLost = 0;

        for (int i = 1; i <= days ; i++) {
            String input = scan.nextLine();
            raisedMoney = 0;
            numberWonGames = 0;
            numberLostGames = 0;

            while (!input.equals("Finish")){

                String winOrLose = scan.nextLine();

                switch (winOrLose){
                    case "win":
                        raisedMoney += 20;
                        numberWonGames += 1;
                        break;
                    case "lose":
                        numberLostGames += 1;
                        break;
                }

                input = scan.nextLine();
                    }

            if (numberWonGames > numberLostGames) {
                raisedMoney = raisedMoney * 1.1;
                daysWon += numberWonGames;
            } else {
                daysLost +=numberLostGames;
           }
            totalRaisedMoney +=raisedMoney;

        }
        if (daysWon > daysLost){
            totalRaisedMoney = totalRaisedMoney * 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalRaisedMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalRaisedMoney);
        }



    }
}
