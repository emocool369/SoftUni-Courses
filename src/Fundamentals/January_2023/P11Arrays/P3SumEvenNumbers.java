package Fundamentals.January_2023.P11Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P3SumEvenNumbers {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scan.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int number : numbers){
            if(number % 2 == 0){
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
