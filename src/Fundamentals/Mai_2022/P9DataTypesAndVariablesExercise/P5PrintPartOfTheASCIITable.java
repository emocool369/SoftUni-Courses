package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P5PrintPartOfTheASCIITable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNumber = Integer.parseInt(scan.nextLine());
        int endNumber = Integer.parseInt(scan.nextLine());

        for (int i = startNumber; i <= endNumber; i++) {

            System.out.print((char)i + " ");
           //System.out.printf("%c ", (char)i);

        }
    }

}
