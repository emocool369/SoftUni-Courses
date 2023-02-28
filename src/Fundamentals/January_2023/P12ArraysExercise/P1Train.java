package Fundamentals.January_2023.P12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P1Train {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numberOfWagons = Integer.parseInt(scan.nextLine());

        int[] wagonsArray = new int[numberOfWagons];
         int sum = 0;

        for (int i = 0; i < wagonsArray.length; i++) {
            wagonsArray[i] = Integer.parseInt(scan.nextLine());
        sum +=wagonsArray[i];
        }


        for (int i = 0; i < wagonsArray.length; i++) {
            System.out.print(wagonsArray[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
