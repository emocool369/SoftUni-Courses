package Basics.L05Proverki.AdditionalExcercises;
import java.util.Scanner;

public class P05Pets {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int leftFoodInKg = Integer.parseInt(scan.nextLine());
        double dogFoodPerDayInKg = Double.parseDouble(scan.nextLine());
        double catFoodPerDayInKg = Double.parseDouble(scan.nextLine());
        double turtleFoodPerDayInGramms = Double.parseDouble(scan.nextLine());

        double totalNeededFood = days * (dogFoodPerDayInKg + catFoodPerDayInKg + (turtleFoodPerDayInGramms / 1000));

        if (leftFoodInKg >= totalNeededFood){
            System.out.printf("%.0f kilos of food left.", Math.floor(leftFoodInKg - totalNeededFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalNeededFood - leftFoodInKg));
        }

    }
}
