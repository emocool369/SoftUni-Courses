package Basics.L07PoSlojniProverki.P08Exercises;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fisherman = Integer.parseInt(scan.nextLine());

        double totalPrice = 0;

        switch (season){
            case "Spring":
                totalPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                totalPrice = 4200;
                break;
            case "Winter":
                totalPrice = 2600;
                break;
        }
        if (fisherman <=6) {
            totalPrice = totalPrice * 0.9;

        } else if (fisherman == 7) {
            totalPrice = totalPrice *0.85;

        } else if (fisherman > 7 && fisherman <= 11) {
            totalPrice = totalPrice *0.85;

        } else if (fisherman > 12) {
            totalPrice = totalPrice * 0.75;

        }
        if (fisherman % 2 == 0 && !(season.equals("Autumn"))){
            totalPrice = totalPrice * 0.95;
    }
        if (totalPrice <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", (budget - totalPrice));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", (totalPrice - budget));
        }
    }

}
