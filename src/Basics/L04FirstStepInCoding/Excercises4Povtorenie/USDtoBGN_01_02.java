package Basics.L04FirstStepInCoding.Excercises4Povtorenie;

import java.util.Scanner;

public class USDtoBGN_01_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();

        double usd = Double.parseDouble(scan.nextLine());
        double bgn = Double.parseDouble(scan.nextLine());

        double convert = usd * bgn;

        System.out.println();

        System.out.printf("The total amount in USD is %.2f USD.", convert);
        System.out.println();

    }
}
