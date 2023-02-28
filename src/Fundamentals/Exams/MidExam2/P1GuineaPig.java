package Fundamentals.Exams.MidExam2;

import java.util.Scanner;

public class P1GuineaPig {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double quantityFoodInKG = Double.parseDouble(scan.nextLine());
        double quantityHayInKG = Double.parseDouble(scan.nextLine());
        double quantityCoverInKG = Double.parseDouble(scan.nextLine());
        double guineasWeightInKG = Double.parseDouble(scan.nextLine());
        int days = 30;

        while (days > 0){
            days = days - 1;
            quantityFoodInKG = quantityFoodInKG - 0.3;
            if (days % 2 == 0){
                quantityHayInKG = quantityHayInKG - (quantityFoodInKG * 0.05);
            }
            if (days % 3 == 0){
                quantityCoverInKG = quantityCoverInKG - (guineasWeightInKG / 3);
            }

            if (Math.floor(quantityFoodInKG) <= 0 || Math.floor(quantityHayInKG) <=0 || Math.floor(quantityCoverInKG) <= 0){
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }


        if (quantityFoodInKG > 0 || quantityHayInKG > 0 || quantityCoverInKG > 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityFoodInKG,quantityHayInKG,quantityCoverInKG);
        }


    }
}
