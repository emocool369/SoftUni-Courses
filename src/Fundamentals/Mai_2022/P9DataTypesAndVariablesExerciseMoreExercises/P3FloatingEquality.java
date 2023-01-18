package Fundamentals.Mai_2022.P9DataTypesAndVariablesExerciseMoreExercises;
import java.util.Scanner;
public class P3FloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());


        double result = Math.abs (a - b);

        if (result < 0.000001){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
