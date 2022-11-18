package Fundamentals.Mai_2022.P6ExerciseSyntax_ConditionalStatementsAndLoops;

import java.util.Scanner;

public class P6StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int number2 = number;

        int totalsum = 0;

        while (number > 0) {
            int digit = number % 10;

            int sum = 1;

            for (int i = 1; i <= digit; i++) {
                sum = sum * i;
            }

            totalsum += sum;

            number = number / 10;
        }

        if (totalsum == number2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
