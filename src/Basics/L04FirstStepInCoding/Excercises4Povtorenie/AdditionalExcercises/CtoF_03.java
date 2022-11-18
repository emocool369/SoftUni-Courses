package Basics.L04FirstStepInCoding.Excercises4Povtorenie.AdditionalExcercises;

import java.util.Scanner;

public class CtoF_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double celsius = Double.parseDouble(scan.nextLine());

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("%.2f", fahrenheit);

    }
}
