package Fundamentals.January_2023.P9DataTypesAndVariableExercise;

import java.util.Random;
import java.util.Scanner;

public class PracticalProjectRockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");

        String playerMove = scan.nextLine();

        if (playerMove.equals("r") || playerMove.equals("rock")){
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("paper")){
            playerMove = PAPER;
        }else if (playerMove.equals("s") || playerMove.equals("scissors")){
            playerMove = SCISSORS;
        }else{
            System.out.println("Invalid Input. Try Again...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);
        String computerMove = "";

        switch (computerRandomNumber){
            case 0:
                computerMove = ROCK;
                break;
            case 1:
                computerMove = PAPER;
                break;

            case 2:
                computerMove = SCISSORS;
                break;
        }

        System.out.printf("The computer chose %s.%n", computerMove);

        if ((playerMove.equals(ROCK)) && computerMove.equals(SCISSORS) ||
            (playerMove.equals(PAPER)) && computerMove.equals(ROCK) ||
            (playerMove.equals(SCISSORS)) && computerMove.equals(PAPER)){
            System.out.println("You win.");
        }else if ((playerMove.equals(ROCK)) && computerMove.equals(ROCK) ||
                (playerMove.equals(PAPER)) && computerMove.equals(PAPER) ||
                (playerMove.equals(SCISSORS)) && computerMove.equals(SCISSORS)){
            System.out.println("This game was a draw.");
        }else {
            System.out.println("You loose.");
        }

    }


}

/* new ideas to implement
Below are a few ideas that you can implement or modify as addition to your code.
Restart the Game
You can automatically restart the game after it is finished (or ask the player to play again).
Scoring System
You can add a scoring system and display the player's and the computer's scores after each game session.
Additional Ideas
•	Can you change your logic, so you can increase the chances of the player to win?
•	Can you add anything else to your code, based on your own ideas?

 */