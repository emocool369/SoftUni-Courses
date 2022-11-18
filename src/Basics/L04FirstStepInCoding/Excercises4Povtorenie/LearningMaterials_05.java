package Basics.L04FirstStepInCoding.Excercises4Povtorenie;

import java.util.Scanner;

public class LearningMaterials_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int himikals = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        int liters = Integer.parseInt(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());

        double priceHimikals = himikals * 5.8;
        double priceMarkers = markers * 7.2;
        double priceLiters = liters * 1.2;

        double totalPrice = priceHimikals + priceLiters + priceMarkers;
        double priceWithDiscount = totalPrice - (totalPrice * discount/100.0);

        System.out.printf("The total amount of money that Ani needs is: %.2f lv.", priceWithDiscount);
        System.out.println();


        }
    }

