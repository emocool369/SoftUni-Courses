package Basics.L04FirstStepInCoding.Excercises4Povtorenie.P04Excercises;

import java.util.Scanner;

public class SchoolSupplies_05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int countPens = Integer.parseInt(scan.nextLine());
        int countMarkers = Integer.parseInt(scan.nextLine());
        int liters = Integer.parseInt(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());

        double sumPens = countPens * 5.80;
        double sumMarkers = countMarkers * 7.20;
        double sumLiters = liters * 1.20;

        double totalSum = sumPens + sumMarkers + sumLiters;

        double finalSum = totalSum - (percent / 100.0) * totalSum;

        System.out.println(finalSum);



    }
}
