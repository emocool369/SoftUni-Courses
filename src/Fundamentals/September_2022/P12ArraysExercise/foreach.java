package Fundamentals.September_2022.P12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int num : array
        ) {
            if (num % 2 == 0) evenSum += num;
            else oddSum += num;
        }
        System.out.println(evenSum - oddSum);
    }
}
