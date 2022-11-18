package Basics.L04FirstStepInCoding.Excercises4Povtorenie.AdditionalExcercises;

import java.util.Scanner;

public class Triangle_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double area = a * h / 2;

        System.out.printf("%.2f", area);
    }
}
