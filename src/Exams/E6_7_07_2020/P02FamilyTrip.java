package Exams.E6_7_07_2020;
import java.util.Scanner;
public class P02FamilyTrip {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int numNights = Integer.parseInt(scan.nextLine());
        double priceNight = Double.parseDouble(scan.nextLine());
        int percentageAdditionCosts = Integer.parseInt(scan.nextLine());

        double totalCost = 0;

        if (numNights > 7){
            priceNight = priceNight * 0.95;
            double totalCostPerNight = priceNight * numNights;
            double additionalCosts = percentageAdditionCosts / 100.00 * budget;

            totalCost = totalCostPerNight + additionalCosts;

        } else {
            double totalCostPerNight = priceNight * numNights;
            double additionalCosts = percentageAdditionCosts / 100.00 * budget;

            totalCost = totalCostPerNight + additionalCosts;
        }

        if (totalCost > budget){
            System.out.printf("%.2f leva needed.", totalCost - budget);
        } else {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalCost);
        }
    }
}
