package Exams.E28_29_2020;

import java.util.Scanner;

public class P04FoodForPets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //всеки трети ден бисквитки
        //бисквитките са 10 % от общо изядената храна

        int days = Integer.parseInt(scan.nextLine());
        double totalAmountFood = Double.parseDouble(scan.nextLine());

        double totalAmountFoodDog = 0.0;
        double totalAmountFoodCat = 0.0;
        double totalAmountEatenFood = 0.0;
        double biscuits = 0.0;


        for (int i = 1; i <= days; i++) {
            int amountFoodDogPerDay = Integer.parseInt(scan.nextLine());
            int amountFoodCatPerDay = Integer.parseInt(scan.nextLine());

            totalAmountFoodDog += amountFoodDogPerDay;
            totalAmountFoodCat += amountFoodCatPerDay;

            if (i % 3 == 0){
                double currentBiscuits = (amountFoodDogPerDay + amountFoodCatPerDay) * 0.1;
                biscuits += currentBiscuits;

            }

        }
            biscuits = Math.round(biscuits);
        totalAmountEatenFood = totalAmountFoodCat + totalAmountFoodDog;


        double percentageFoodDog = totalAmountFoodDog / totalAmountEatenFood;
        double percentageFoodCat = totalAmountFoodCat / totalAmountEatenFood;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalAmountEatenFood / totalAmountFood * 100.0);
        System.out.printf("%.2f%% eaten from the dog.%n", percentageFoodDog * 100.0);
        System.out.printf("%.2f%% eaten from the cat.%n", percentageFoodCat * 100.0);


    }
}
