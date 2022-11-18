package Exams.E29_10_2022;

import java.util.Scanner;

public class P06GoldMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numLocations = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= numLocations; i++) {
            int averageKgPlan = Integer.parseInt(scan.nextLine());
            int numDays = Integer.parseInt(scan.nextLine());
            int totalKg = 0;
            for (int j = 1; j <= numDays; j++) {
                int kg = Integer.parseInt(scan.nextLine());
                totalKg += kg;
            }
            double averageKdIst = totalKg * 1.0 / numDays;

            if (averageKdIst > averageKgPlan) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageKdIst);
            } else {
                System.out.printf("You need %.2f gold.", averageKgPlan - averageKdIst);
            }


        }

    }
}
