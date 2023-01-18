package Fundamentals.Mai_2022.P12ArraysExercises;

import java.util.Scanner;
import java.util.Arrays;

public class P2AnotherSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstRow = scan.nextLine();
        String secondRow = scan.nextLine();

        String[] firstArray = firstRow.split(" ");
        String[] secondArray = secondRow.split(" ");

        for (String elementInSecondArray : secondArray) {
            for (String elementInFirstArray : firstArray) {
                if (elementInFirstArray.equals(elementInSecondArray)) {
                    System.out.print(elementInFirstArray + " ");
                    break;
                }
            }
        }
    }
}
