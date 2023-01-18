package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P5AnotherSolution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = "";

        int block = 0;

        char character;
        for (int i = 0; i < username.length(); i++) {
            character = username.charAt(i);
            password = character + password;
        }


        String enterPassword = scan.nextLine();

        while(!enterPassword.equals(password)){

            block ++;
            if (block == 4){
                System.out.printf("User %s blocked!",username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            enterPassword = scan.nextLine();
        }

        System.out.printf("User %s logged in.", username);

    }
}
