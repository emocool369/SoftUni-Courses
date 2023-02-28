package Fundamentals.January_2023.P9DataTypesAndVariableExercise;

import java.util.Scanner;

public class P7WaterOverflow {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < numberOfLines; i++) {
            int newLitters = Integer.parseInt(scan.nextLine());

            if (sum + newLitters > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            } else {
                sum += newLitters;
            }

        }
        System.out.println(sum);

    }
}
