package Basics.L04FirstStepInCoding.Excercises4Povtorenie.P04Excercises;

import java.util.Scanner;

public class UsdToBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double usd = Double.parseDouble(scan.nextLine());

        double bgn = usd * 1.79549;

        System.out.println(bgn);

    }
}
