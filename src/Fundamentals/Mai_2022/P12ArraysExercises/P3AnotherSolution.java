package Fundamentals.Mai_2022.P12ArraysExercises;

import java.util.Scanner;
import java.util.Arrays;

public class P3AnotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int row = 1; row <= n; row++) {
            String numbers = scan.nextLine();
            int firstNumber = Integer.parseInt(numbers.split(" ")[0]);
            int secondNumber = Integer.parseInt(numbers.split(" ")[1]);

            if (row % 2 == 0) {
                firstArray[row - 1] = secondNumber;
                secondArray[row - 1] = firstNumber;

            } else {

                firstArray[row - 1] = firstNumber;
                secondArray[row - 1] = secondNumber;

            }

        }
        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondArray) {
            System.out.print(number + " ");

        }
    }
}
