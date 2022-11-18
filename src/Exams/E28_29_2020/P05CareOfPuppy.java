package Exams.E28_29_2020;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int boughtFood = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        int totalEatenFood = 0;
        int eatenFoodPerEating = 0;

        while(!input.equals("Adopted")){
           eatenFoodPerEating = Integer.parseInt(input);
            totalEatenFood +=eatenFoodPerEating;

            input = scan.nextLine();
        }

        int boughtFoodInGramms = boughtFood * 1000;

        if (totalEatenFood > boughtFoodInGramms){
            System.out.printf("Food is not enough. You need %d grams more.", totalEatenFood - boughtFoodInGramms);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", boughtFoodInGramms - totalEatenFood);
        }


    }
}
