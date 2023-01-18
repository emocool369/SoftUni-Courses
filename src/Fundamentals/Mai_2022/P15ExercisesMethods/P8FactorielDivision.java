package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class P8FactorielDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        double result = calculationFactorial(num1,num2) * 1.0;
        System.out.printf("%.2f", result);

    }

    public static long calculationFactorial (int n1, int n2){
        long result = 0;

        int factorial1 = 1;
        int factorial2 = 1;

        for (int i = 1; i <= n1; i++) {
            factorial1 *= i;
        }

        for (int i = 1; i <= n2; i++) {
            factorial2 *= i;
        }

        result = factorial1 / factorial2;

        return result;
    }

}
