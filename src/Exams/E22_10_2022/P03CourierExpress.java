package Exams.E22_10_2022;

import java.util.Scanner;

public class P03CourierExpress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double weightPackage = Double.parseDouble(scan.nextLine());
        String service = scan.nextLine();
        int distanceInKm = Integer.parseInt(scan.nextLine());

        double totalCost = 0;

        switch (service){
            case "standard":
                if (weightPackage < 1.0){
                    totalCost = distanceInKm * 0.03;
                }else if (weightPackage >= 1 && weightPackage < 10){
                    totalCost = distanceInKm * 0.05;
                }else if (weightPackage >= 10 && weightPackage < 40){
                    totalCost = distanceInKm * 0.10;
                }else if (weightPackage >= 40 && weightPackage < 90){
                    totalCost = distanceInKm * 0.15;
                }else if (weightPackage >= 90 && weightPackage < 150) {
                    totalCost = distanceInKm * 0.20;
                }
                    break;
            case "express":
                if (weightPackage < 1){
                    totalCost = (distanceInKm * 0.03) + (((0.03 * 0.8) * weightPackage) * distanceInKm);
                }else if (weightPackage >= 1 && weightPackage < 10){
                    totalCost = (distanceInKm * 0.05) + (((0.05 * 0.4) * weightPackage) * distanceInKm);
                }else if (weightPackage >= 10 && weightPackage < 40){
                    totalCost = (distanceInKm * 0.10) + (((0.10 * 0.05) * weightPackage) * distanceInKm);
                }else if (weightPackage >= 40 && weightPackage < 90){
                    totalCost = (distanceInKm * 0.15) + (((0.15 * 0.02) * weightPackage) * distanceInKm);
                }else if (weightPackage >= 90 && weightPackage < 150) {
                    totalCost = (distanceInKm * 0.2) + (((0.2 * 0.01) * weightPackage) * distanceInKm);
                }
                break;
        }

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weightPackage, totalCost);

    }


}
