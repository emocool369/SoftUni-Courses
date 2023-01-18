package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P7WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int litres = 0;
        int result = 0;

        for (int i = 1; i <= n; i++) {

            litres = Integer.parseInt(scan.nextLine());

            sum = sum + litres;
            if (sum > 255) {
                result = sum - litres;
                sum = result;
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(sum);
    }
}
