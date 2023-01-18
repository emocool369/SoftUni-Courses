package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExerciseMore;

import java.util.Scanner;

public class P5Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int offsetOfTheNumber = 0;

        for (int i = 1; i <= num; i++) {
            int code = Integer.parseInt(scan.nextLine());

            int numberOfDigits = Integer.toString(code).length();
            char oneDigit = Integer.toString(code).charAt(0);
            int mainDigit = Character.getNumericValue(oneDigit);
            if (mainDigit == 8 || mainDigit == 9) {
                offsetOfTheNumber = (mainDigit - 2) * 3 + 1;
            } else {
                offsetOfTheNumber = (mainDigit - 2) * 3;
            }
            int letterIndex = offsetOfTheNumber + numberOfDigits - 1;
            int letterCode = letterIndex + 97;

            char letter = (char) letterCode;
            if (mainDigit == 0) {
                letter = (char) (mainDigit + 32);
            }
            System.out.print(letter);


        }
    }
}


