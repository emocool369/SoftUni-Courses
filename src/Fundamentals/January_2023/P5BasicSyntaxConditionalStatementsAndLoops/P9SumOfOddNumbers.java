package Fundamentals.January_2023.P5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P9SumOfOddNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int result = 0;

        for (int i = 1; i <= number * 2; i += 2) {
            System.out.println(i);
            result += i;
        }
        System.out.println("Sum: "+ result);
    }
}
