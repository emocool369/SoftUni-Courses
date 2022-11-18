package Fundamentals.Mai_2022.P6ExerciseSyntax_ConditionalStatementsAndLoops;

import java.util.Scanner;

public class P8TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int current = 0;

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {

                current = i;

                System.out.print(current + " ");
            }
            System.out.println();
        }

    }


}

