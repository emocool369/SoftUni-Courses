package Fundamentals.September_2022.P12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P5TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int topNumber = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {

            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
                break;
            }
            boolean isTop = false;
            if (numbers[i] < numbers[i + 1]) {
                continue;
            } else if (numbers[i] > numbers[i + 1]) {
                topNumber = numbers[i];

                for (int j = i + 1; j <= numbers.length - 1; j++) {
                    isTop = (numbers[i] > numbers[j]);
                }
            }
            if (isTop) {
                System.out.print(topNumber + " ");
            }
        }
    }
}

