package Fundamentals.Mai_2022.P9DataTypesAndVariablesExerciseMoreExercises;
import java.util.Scanner;
public class P4Refactoring_PrimeChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for (int i = 2; i <= num; i++) {
            boolean isValid = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isValid = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isValid);
        }


    }
}
