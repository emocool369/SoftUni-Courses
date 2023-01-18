package Fundamentals.January_2023.P5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P11MultiplicationTable20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int times = Integer.parseInt(scan.nextLine());

        int product = 0;

        if(times > 10){
            product = num * times;

            System.out.printf("%d X %d = %d%n", num, times, product);
        }else {

            while (times <= 10) {

                product = num * times;

                System.out.printf("%d X %d = %d%n", num, times, product);

                times++;

            }
        }

    }
}
