package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P2SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (n > 0) {
            //sum = sum + (n % 10);
            sum += n % 10;
            //n = n / 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
