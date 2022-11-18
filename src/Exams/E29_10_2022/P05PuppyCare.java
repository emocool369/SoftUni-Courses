package Exams.E29_10_2022;
import java.util.Scanner;
public class P05PuppyCare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int boughFood = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int totalFood = 0;
        int boughtFoodInGrams = boughFood * 1000;

        while(!input.equals("Adopted")){
            int food = Integer.parseInt(input);
            totalFood += food;


            input = scan.nextLine();

        }

        if (totalFood > boughtFoodInGrams){
            int a = totalFood - boughtFoodInGrams;
            System.out.printf("Food is not enough. You need %d grams more.", a);
        } else {
            int b = boughtFoodInGrams - totalFood;
            System.out.printf("Food is enough! Leftovers: %d grams.", b);
        }

    }
}
