package Fundamentals.January_2023.P11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P7CondenseArrayToNumber {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i = 0; i <= numbers.length; i++) {

            if(numbers.length == 1){
                System.out.println(Integer.parseInt(Integer.toString(numbers[0])));
            return;
            }

            int[] secondArray = new int[numbers.length - 1];

            for (int j = 0; j < numbers.length - 1; j++) {
               sum = numbers[j] + numbers[j + 1];
               secondArray[j] = sum;
            }

            numbers = secondArray;
            if(i >= numbers.length){
                i = 0;
            }

        }

        int finalNumber = Integer.parseInt(Integer.toString(numbers[0]));
        System.out.println(finalNumber);
    }
}
