package Exams.E28_29_2020;
import java.util.Scanner;
public class P02CatWalking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1 min - 5 cal
        //50 % of taken calories

        int walkingMinutesPerDay = Integer.parseInt(scan.nextLine());
        int numberWalksPerDay = Integer.parseInt(scan.nextLine());
        int takenCals = Integer.parseInt(scan.nextLine());

        int totalWalkingMinutesPerDay = walkingMinutesPerDay * numberWalksPerDay;

        int amountBurnedCals = totalWalkingMinutesPerDay * 5;

        int neededCalsPerDay = takenCals / 2;

        if (amountBurnedCals >= neededCalsPerDay){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", amountBurnedCals);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", amountBurnedCals);
        }

    }
}
