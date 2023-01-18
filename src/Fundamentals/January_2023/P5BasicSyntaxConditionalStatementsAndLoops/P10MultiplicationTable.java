package Fundamentals.January_2023.P5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P10MultiplicationTable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int times = 0;
        int product = 0;

        while (times < 10) {

            times++;
            product = num * times;

            System.out.printf("%d X %d = %d%n", num, times, product);

        }


    }
}
