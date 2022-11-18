package Exams.E28_29_2020;

import java.util.Scanner;

public class P03EnergyBooster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String size = scan.nextLine();
        int numberOrderedSets = Integer.parseInt(scan.nextLine());

        double totalPrice = 0;

        switch (fruit) {
            case "Watermelon":
                switch (size) {
                    case "small":
                        totalPrice = numberOrderedSets * 2 * 56.0;
                        break;
                    case "big":
                        totalPrice = numberOrderedSets * 5 * 28.7;
                        break;

                }
                break;
            case "Mango":
                switch (size) {
                    case "small":
                        totalPrice = numberOrderedSets * 2 * 36.66;
                        break;
                    case "big":
                        totalPrice = numberOrderedSets * 5 * 19.6;
                        break;

                }
                break;
            case "Pineapple":
                switch (size) {
                    case "small":
                        totalPrice = numberOrderedSets * 2 * 42.10;
                        break;
                    case "big":
                        totalPrice = numberOrderedSets * 5 * 24.8;
                        break;

                }
                break;
            case "Raspberry":
                switch (size) {
                    case "small":
                        totalPrice = numberOrderedSets * 2 * 20.0;
                        break;
                    case "big":
                        totalPrice = numberOrderedSets * 5 * 15.2;
                        break;

                }
                break;
        }

        if (totalPrice < 400) {
            System.out.printf("%.2f lv.", totalPrice);
            ;
        } else if (totalPrice >= 400 && totalPrice <= 1000) {
            System.out.printf("%.2f lv.", totalPrice * 0.85);
        } else if (totalPrice > 1000) {
            System.out.printf("%.2f lv.", totalPrice * 0.5);
        }


    }
}
