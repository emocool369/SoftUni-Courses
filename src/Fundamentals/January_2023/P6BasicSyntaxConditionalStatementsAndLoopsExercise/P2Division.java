package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P2Division {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int integer = Integer.parseInt(scan.nextLine());

        int division = 0;

        if (integer % 10 == 0) {
            division = 10;
        } else if (integer % 7 == 0) {
            division = 7;
        }else if (integer % 6 == 0) {
            division = 6;
        } else if (integer % 3 == 0){
            division = 3;
        }else if (integer % 2 == 0){
            division = 2;
        }else{
            System.out.println("Not divisible");
            return;
        }
        System.out.println("The number is divisible by " + division);
    }
}
