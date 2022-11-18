package Basics.L09ForCicle.Lab2;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            leftSum = leftSum + currentNum;
        }
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());

            rightSum = rightSum + currentNum;
        }
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            int diff = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
