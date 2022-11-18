package Basics.L04FirstStepInCoding.Excercises4Povtorenie.AdditionalExcercises;

import java.util.Scanner;

public class PerimetarILizeNaKrag_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = Double.parseDouble(scan.nextLine());

        double lize = Math.PI * (r * r);
        double perimetar = 2 * Math.PI * r;

        System.out.printf("%.2f", lize);
        System.out.println();
        System.out.printf("%.2f", perimetar);

    }
}
