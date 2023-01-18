package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P5AnotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = "";

        int block = 0;

        for (int i = username.length() - 1; i >= 0 ; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
            
        }
        String enterPassword = scan.nextLine();

        while(!enterPassword.equals(password)){

            block ++;
            if (block == 4){
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enterPassword = scan.nextLine();
        }
            if(enterPassword.equals(password)){
                System.out.printf("User %s logged in.", username);
            }

    }
}
