package Fundamentals.September_2022.P12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P7MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int repetition = 1;
        int maxNum = 0;
        int number = 0;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == array[i + 1]) {
                repetition += 1;

                if (repetition > maxNum) {
                    maxNum = repetition;
                    number = array[i];
                }
            }
            if (array[i] != array[i + 1]) {
                repetition = 1;
            }
        }
        if (repetition == 1 && maxNum == 0) {
            System.out.println(array[0]);
        } else {
            for (int i = 1; i <= maxNum; i++) {
                System.out.print(number + " ");
            }
        }
    }
}
