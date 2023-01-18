package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P4PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNumber = Integer.parseInt(scan.nextLine());
        int endNumber = Integer.parseInt(scan.nextLine());
        int sum = 0;


        for (int i = startNumber; i <= endNumber; i++) {
            sum = sum + i;
            System.out.print(i + " ");
        }

        //System.out.printf(%nSum: %d", sum);
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
