package Basics.L04FirstStepInCoding.Excercises4Povtorenie.AdditionalExcercises;

import java.util.Scanner;

public class FishMarket_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double skumriaPricePerKg = Double.parseDouble(scan.nextLine());
        double cacaPricePerKg = Double.parseDouble(scan.nextLine());

        double palamudKg = Double.parseDouble(scan.nextLine());
        double safridKg = Double.parseDouble(scan.nextLine());

        int midiKg = Integer.parseInt(scan.nextLine());

        double palamudPricePerKg = skumriaPricePerKg * 1.6;
        double safridPricePerKg = cacaPricePerKg * 1.8;

        double palamudTotalPrice = palamudKg * palamudPricePerKg;
        double safridTotalPrice = safridKg * safridPricePerKg;
        double midiTotalPrice = midiKg * 7.5;

        double totalPrice = palamudTotalPrice + safridTotalPrice + midiTotalPrice;

        System.out.printf("%.2f", totalPrice);




    }
}
