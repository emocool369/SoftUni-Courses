package Fundamentals.Mai_2022.P12ArraysExercises;

import java.util.Scanner;
import java.util.Arrays;

public class P5TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //правя текста в текстовия масив на числа в масив


        for (int index = 0; index < numbers.length; index++) {
            int currentNumber = numbers[index];

            if(index == numbers.length - 1){
                System.out.print(currentNumber + " ");
            continue; //break;
            }

            boolean isTop = false;
            for (int j = index + 1; j <= numbers.length - 1; j++) {
                int nextNumber = numbers[j];
                if (currentNumber > nextNumber) {
                    isTop = true;

                } else {
                    isTop = false;
                    break;
                }

                }
            if (isTop) {
                System.out.print(currentNumber + " ");
        }

        }

    }
}
