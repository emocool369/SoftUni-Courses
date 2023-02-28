package Fundamentals.January_2023.P9DataTypesAndVariableExercise;

import java.util.Random;
import java.util.Scanner;

public class PracticalProjectGuessANumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(100);

        while (true) {
            System.out.print("Guess a number (1-100): ");
            String playerInput = scan.nextLine();
            int playerNumber = Integer.parseInt(playerInput);

            boolean isValid = true;

            for (int i = 0; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57){
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                if (playerNumber == computerNumber) {
                    System.out.println("You guessed it!");
                    break;
                } else if (playerNumber > computerNumber) {
                    System.out.println("Too High");
                } else if (playerNumber < computerNumber) {
                    System.out.println("Too Low");
                } else {
                    System.out.println("Invalid input.");
                }
            }
        }
    }
}
