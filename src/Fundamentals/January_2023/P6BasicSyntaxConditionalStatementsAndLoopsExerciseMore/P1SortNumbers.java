package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExerciseMore;

import java.util.Scanner;

public class P1SortNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        int biggestNumber = 0;
        int secondBiggestNumber = 0;
        int thirdBiggestNumber = 0;

        if (num1 >= num2 && num2 >= num3) {
            biggestNumber = num1;
            secondBiggestNumber = num2;
            thirdBiggestNumber = num3;
        } else if (num1 >= num2 && num3 >= num2 && num1 >= num3) {
            biggestNumber = num1;
            secondBiggestNumber = num3;
            thirdBiggestNumber = num2;
        } else if (num2 >= num1 && num1 >= num3) {
            biggestNumber = num2;
            secondBiggestNumber = num1;
            thirdBiggestNumber = num3;
        } else if (num2 >= num3 && num3 >= num1) {
            biggestNumber = num2;
            secondBiggestNumber = num3;
            thirdBiggestNumber = num1;
        } else if (num3 >= num1 && num1 >= num2) {
            biggestNumber = num3;
            secondBiggestNumber = num1;
            thirdBiggestNumber = num2;
        } else if (num3 >= num2 && num2 >= num1 && num3 >= num1) {
            biggestNumber = num3;
            secondBiggestNumber = num2;
            thirdBiggestNumber = num1;
        }

        System.out.println(biggestNumber);
        System.out.println(secondBiggestNumber);
        System.out.println(thirdBiggestNumber);

    }


}
