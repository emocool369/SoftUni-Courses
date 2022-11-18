package Fundamentals.Mai_2022.P6ExerciseSyntax_ConditionalStatementsAndLoops;

import java.util.Scanner;

public class P5AnotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {

            char currentSymbol = username.charAt(i);
            password += currentSymbol;

        }

        int countFailed = 0;
        String enteredPassword = scan.nextLine();

        while (!enteredPassword.equals(password)) {
            countFailed++;

            if (countFailed == 4) {
                System.out.printf("User %s blocked!", username);
                break; //return; - прекратява цялата програма и няма да има нужда от допълнителна проверка долу
            }

            System.out.println("Incorrect password. Try again.");
            enteredPassword = scan.nextLine();
        }
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
