package Basics.L05Proverki.P06Excercises;

import java.util.Scanner;

public class P04ToyShop {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scan.nextLine());
        int numPuzzels = Integer.parseInt(scan.nextLine());
        int numTalkingDolls = Integer.parseInt(scan.nextLine());
        int numTeddyBears = Integer.parseInt(scan.nextLine());
        int numMinions = Integer.parseInt(scan.nextLine());
        int numTrucks = Integer.parseInt(scan.nextLine());

        int totalAmountToys = numPuzzels + numTalkingDolls + numTeddyBears + numMinions + numTrucks;
        double totalEarnings = (numPuzzels * 2.60) + (numTalkingDolls * 3) + (numTeddyBears * 4.10) + (numMinions * 8.20) + (numTrucks * 2);
        //равно на 50 или повече играчки, отсъпка 25 %
        // 10 % наем от спечелените пари

        if (totalAmountToys >= 50){
            totalEarnings = totalEarnings * 0.75 * 0.9;

            if (totalEarnings >= priceExcursion){

                System.out.printf("Yes! %.2f lv left.", (totalEarnings - priceExcursion));
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", (priceExcursion - totalEarnings));
            }



        } else {
            totalEarnings = totalEarnings * 0.9;
            if (totalEarnings >= priceExcursion){

                System.out.printf("Yes! %.2f lv left.", (totalEarnings - priceExcursion));
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", (priceExcursion - totalEarnings));
            }
        }

    }

}
