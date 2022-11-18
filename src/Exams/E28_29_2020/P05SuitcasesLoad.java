package Exams.E28_29_2020;

import java.util.Scanner;

public class P05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double capacityBaggageDepartment = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();

        double restCapacityBaggageDepartment = 0;
        int numberSuitCases = 0;

        while(!input.equals("End")){
            numberSuitCases +=1;
            double volumeSuitCase = Double.parseDouble(input);

            if (numberSuitCases % 3 == 0){
                volumeSuitCase = volumeSuitCase * 1.1;
            }

            restCapacityBaggageDepartment = capacityBaggageDepartment - volumeSuitCase;



            input = scan.nextLine();

            if (restCapacityBaggageDepartment < 0){
                System.out.printf("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.", numberSuitCases);
            }

        }

        if (restCapacityBaggageDepartment >= 0){
            System.out.printf("Congratulations! All suitcases are loaded! ");
            System.out.printf("Statistic: %d suitcases loaded.", numberSuitCases);
        }

    }
}
