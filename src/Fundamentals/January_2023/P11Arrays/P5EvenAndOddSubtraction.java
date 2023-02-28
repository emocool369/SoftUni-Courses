package Fundamentals.January_2023.P11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P5EvenAndOddSubtraction {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int number : numbers){
            if(number % 2 == 0){
                evenSum += number;
            }else{
                oddSum += number;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
