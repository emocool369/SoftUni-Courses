package Fundamentals.January_2023.P9DataTypesAndVariableExercise;

import java.util.Scanner;

public class P4SumOfChars {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numLines = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < numLines; i++) {
            char letters = scan.nextLine().charAt(0);
            sum += letters;

            //int ascii = c; how to get ascii value of character
            //int castAscii = (int) c;  - alternative

        }
        System.out.println("The sum equals: " + sum);
    }
}
