package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P8TriangleOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= num; i++) {


            for (int j = i; j < i * 2; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
