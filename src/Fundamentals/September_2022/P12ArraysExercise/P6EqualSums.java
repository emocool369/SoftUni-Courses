package Fundamentals.September_2022.P12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P6EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            int currentNum = numbers[i];
            if (i == 0) {
                  for (int j = numbers.length - 1; j > i; j--) {
                    rightSum += numbers[j];
                }
            }

            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    leftSum += numbers[j];
                }
                for (int k = numbers.length - 1; k > i; k--) {
                    rightSum += numbers[k];
                }
            }

            if (leftSum == rightSum) {
                System.out.println(i);
                break;
            } else if (i == numbers.length - 1){
                System.out.println("no");
                break;
            }

        }


    }
}
