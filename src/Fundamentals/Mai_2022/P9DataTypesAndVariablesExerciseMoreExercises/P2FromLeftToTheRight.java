package Fundamentals.Mai_2022.P9DataTypesAndVariablesExerciseMoreExercises;

import java.util.Scanner;

public class P2FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= n; i++) {
            long sum = 0;
            long firstNumber = Long.parseLong(scan.next());
            long secondNumber = Long.parseLong(scan.next());

            if (firstNumber > secondNumber) {
                long digit = firstNumber;
                while (digit != 0) {
                    sum += Math.abs(digit % 10);
                    digit = Math.abs(digit / 10);

                }
            } else {
                long digit = secondNumber;
                while (digit != 0) {
                    sum += Math.abs(digit % 10);
                    digit = Math.abs(digit / 10);
                }
            }
            System.out.println(sum);


        }

    }
}

//    String input = scanner.nextLine();     // "1234 5678"
//    String[] parts = input.split(" ");
//    String part1 = parts[0];               // "1234"
//    String part2 = parts[1];               // "5678"
//    long number1 = Long.parseLong(part1);  // 1234
//    long number2 = Long.parseLong(part2);  // 5678
//    long biggest = Math.max(number1, number2);  // 5678