package Fundamentals.Mai_2022.P15ExercisesMethods;

import java.util.Scanner;

public class P8anotherSolutionWithOneMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        long fact1 = calculationFactorial(num1);
        long fact2 = calculationFactorial(num2);

        double result = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", result);

    }

    public static long calculationFactorial (int number){
        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

       return fact;
    }

}
