package Fundamentals.January_2023.P12ArraysExercise;

import java.util.Scanner;

public class P4ArrayRotation {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] newArray = scan.nextLine().split(" ");
        int numberOfRotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfRotations; i++) {
            String firstNum = newArray[0];

            for (int j = 0; j < newArray.length-1; j++) {
                newArray[j] = newArray[j + 1];
            }

            newArray[newArray.length - 1] = firstNum;

        }
        System.out.println(String.join(" ", newArray));

    }
}
