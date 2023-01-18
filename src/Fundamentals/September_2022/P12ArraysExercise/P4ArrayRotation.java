package Fundamentals.September_2022.P12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P4ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rotations; i++) {

            int[] firstElement = new int[1]; //String firstElement = numbers[0];
            firstElement[0] = numbers[0];

            for (int j = 0; j < numbers.length - 1; j++) {
                numbers[j] = numbers[j + 1];
            }


            numbers[numbers.length - 1] = firstElement[0]; //numbers[numbers.length - 1] = firstElement;

        }

        System.out.println(Arrays.toString(numbers).replace("[", "").replace(",", "").replace("]", ""));

    }
}
