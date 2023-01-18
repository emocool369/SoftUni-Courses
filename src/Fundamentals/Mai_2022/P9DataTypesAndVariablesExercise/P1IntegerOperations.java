package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;
import java.util.Scanner;
public class P1IntegerOperations {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int d = Integer.parseInt(scan.nextLine());

        int sum = a + b;
        int divide = sum / c;
        int result = divide * d;

        System.out.println(result);

    }

}
