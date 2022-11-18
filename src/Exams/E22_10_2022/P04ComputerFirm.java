package Exams.E22_10_2022;

import java.util.Scanner;

public class P04ComputerFirm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numComputers = Integer.parseInt(scan.nextLine());
        double totalSales = 0;
        double totalSales2 = 0;
        double totalSales3 = 0;
        double totalSales4 = 0;
        double totalSales5 = 0;
        double totalSales6 = 0;

        int totalDigits = 0;
        int digit2 = 0;
        int digit3 = 0;
        int digit4 = 0;
        int digit5 = 0;
        int digit6 = 0;


        for (int i = 1; i <= numComputers ; i++) {
            int rating = Integer.parseInt(scan.nextLine());

            int digit = rating % 10;

            rating = rating / 10;

            if ( digit == 2){
                totalSales2 += rating * 0.0;
                digit2 += digit;
            } else if (digit == 3){
                totalSales3 += rating * 0.5;
                digit3 += digit;
            } else if (digit == 4) {
                totalSales4 += rating * 0.7;
                digit4 += digit;
            } else if (digit == 5){
                totalSales5 += rating * 0.85;
                digit5 += digit;
            } else if (digit == 6){
                totalSales6 += rating;
                digit6 += digit;
            }

        }

        totalSales = totalSales2 + totalSales3 + totalSales4 + totalSales5 + totalSales6;
        totalDigits = digit2 + digit3 + digit4 + digit5 + digit6;

        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f%n", totalDigits * 1.0 / numComputers);
    }


}
