package Basics.L04FirstStepInCoding.Excercises4Povtorenie;

import java.util.Scanner;

public class USDtoBGN_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dollars = Double.parseDouble(scan.nextLine());
        double leva = dollars * 1.79549;

        System.out.println(leva);

    }
}
