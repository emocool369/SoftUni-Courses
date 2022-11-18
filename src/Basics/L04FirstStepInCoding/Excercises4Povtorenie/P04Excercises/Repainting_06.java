package Basics.L04FirstStepInCoding.Excercises4Povtorenie.P04Excercises;


import java.util.Scanner;

public class Repainting_06 {

    public static void main(String[] args) {



    Scanner scan = new Scanner(System.in);

    int quantityNylon = Integer.parseInt(scan.nextLine());
    int quantityPaint = Integer.parseInt(scan.nextLine());
    int quantityDiluent = Integer.parseInt(scan.nextLine());
    int hours = Integer.parseInt(scan.nextLine());

    double sumNylon = (quantityNylon + 2) * 1.5;
    double sumPaint = (quantityPaint + 0.1 *quantityPaint) * 14.5;
    double sumDiluent = quantityDiluent * 5;
    double sumBags = 0.4;

    double sumMaterials = sumNylon + sumPaint + sumDiluent + sumBags;
    double sumWorkers = hours * (0.3 * sumMaterials);
    double finalSum = sumMaterials + sumWorkers;

  System.out.println(finalSum);



}
}
