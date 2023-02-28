package Fundamentals.Exams.MidExam4;

import java.util.Scanner;

public class P1CookingMasterclass {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int numStudents = Integer.parseInt(scan.nextLine());
        double pricePackageFlour = Double.parseDouble(scan.nextLine());
        double priceSingleEgg = Double.parseDouble(scan.nextLine());
        double priceSingleApron = Double.parseDouble(scan.nextLine());

        int freeFlourPackages = 0;

        for (int i = 1; i <= numStudents; i++) {
            if(i % 5 == 0){
                freeFlourPackages++;
            }
        }


        double totalPriceFlour = (numStudents - freeFlourPackages) * pricePackageFlour;
        double totalPriceEggs = numStudents * 10 * priceSingleEgg;
        double totalNumApron = Math.ceil(numStudents + (numStudents * 0.2));
        double totalPriceApron = totalNumApron * priceSingleApron;

        double totalCost = totalPriceFlour + totalPriceEggs + totalPriceApron;

        if( totalCost <= budget){
            System.out.printf("Items purchased for %.2f$.", totalCost);
        }else{
            System.out.printf("%.2f$ more needed.", totalCost - budget);
        }



    }
}
