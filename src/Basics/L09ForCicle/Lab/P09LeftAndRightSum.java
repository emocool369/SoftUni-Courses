package Basics.L09ForCicle.Lab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            sum1 = sum1 + currentNum;
        }

        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            sum2 = sum2 + currentNum;
        }

        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            int diff = Math.abs(sum1 - sum2);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
