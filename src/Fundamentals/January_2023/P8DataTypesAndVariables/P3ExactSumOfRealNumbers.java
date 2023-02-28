package Fundamentals.January_2023.P8DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class P3ExactSumOfRealNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        byte numbersN = Byte.parseByte(scan.nextLine());

       BigDecimal result = new BigDecimal(0);

        for (int i = 1; i <= numbersN ; i++) {
            BigDecimal number = new BigDecimal(scan.nextLine());

            result = result.add(number);

        }
        System.out.println(result);
    }
}
