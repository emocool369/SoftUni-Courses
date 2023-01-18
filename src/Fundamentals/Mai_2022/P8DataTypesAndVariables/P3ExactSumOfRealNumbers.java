package Fundamentals.Mai_2022.P8DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class P3ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            BigDecimal curentSum = new BigDecimal(scan.nextLine());

            sum = sum.add(curentSum);


        }
        System.out.println(sum);

    }
}
