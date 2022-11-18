package Basics.L07PoSlojniProverki.P08Exercises;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int flowersCount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double totalPrice = 0.00;

        switch (flower) {
            case "Roses":
                totalPrice = flowersCount * 5;
                if (flowersCount > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.1); // totalPrice = totalPrice * 0.9;
                }
                break;
            case "Dahlias":
                totalPrice = flowersCount * 3.8;
                if (flowersCount > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                totalPrice = flowersCount * 2.8;
                if (flowersCount > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                totalPrice = flowersCount * 3;
                if (flowersCount < 120) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                totalPrice = flowersCount * 2.5;
                if (flowersCount < 80) {
                    totalPrice = totalPrice + (totalPrice * 0.2);
                }
                break;
        }
        if (totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flower, (budget - totalPrice));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", (totalPrice - budget));
        }
    }
}