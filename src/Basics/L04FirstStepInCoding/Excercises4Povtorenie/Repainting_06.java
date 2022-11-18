package Basics.L04FirstStepInCoding.Excercises4Povtorenie;

import java.util.Scanner;

public class Repainting_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int naylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());
        int workHours = Integer.parseInt(scan.nextLine());
        double bags = 0.4;

        double sumNaylon = (naylon +2) * 1.5;
        double sumPaint = (paint * 1.1) * 14.5;
        double sumThinner = thinner * 5.0;

        double totalSumMaterials = sumNaylon + sumPaint + sumThinner + bags;

        double oneWorkHour = (totalSumMaterials * 0.3) * workHours;

        double totalSum = totalSumMaterials + oneWorkHour;

        System.out.println(totalSum);


    }
}
