package Basics.L09ForCicle.P10Excercises2;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;

        for (int i = 1; i <= n; i++) {

            int nextN = Integer.parseInt(scan.nextLine());

            if (nextN < 200) {
                sum1++;
            } else if (nextN >= 200 && nextN <= 399) {
                sum2++;
            } else if (nextN >= 400 && nextN <= 599) {
                sum3 = sum3 + 1;
            } else if (nextN >= 600 && nextN <= 799) {
                sum4 = sum4 + 1;
            } else if (nextN >= 800) {
                sum5 = sum5 + 1;
            }


        }
        System.out.printf("%.2f %%%n", ((sum1 * 1.0 / n)) * 100);
        System.out.printf("%.2f%%%n", ((sum2 * 1.0 / n)) * 100);
        System.out.printf("%.2f%%%n", ((sum3 * 1.0 / n)) * 100);
        System.out.printf("%.2f%%%n", ((sum4 * 1.0 / n)) * 100);
        System.out.printf("%.2f%%%n", ((sum5 * 1.0 / n)) * 100);
    }
}
