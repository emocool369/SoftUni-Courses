package Fundamentals.January_2023.P9DataTypesAndVariableExercise;

import java.util.Scanner;

public class P2SumDigits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int integer = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (integer > 0){
            int lastDigit = integer % 10;
            sum += lastDigit;
            integer = integer / 10;

        }
        System.out.println(sum);
    }
}
