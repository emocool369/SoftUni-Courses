package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExerciseMore;

import java.util.Scanner;

public class P4ReverseString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String reverse = "";

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);
            reverse = currentChar + reverse;


        }

        System.out.println(reverse);
    }
}
