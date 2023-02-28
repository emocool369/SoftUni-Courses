package Fundamentals.January_2023.P9DataTypesAndVariableExercise;

import java.util.Scanner;

public class P5PrintPartOfASCIITable {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        for (int i = start; i <= end ; i++) {
            char c = (char) i;
            System.out.print(c + " ");
        }

    }
}
