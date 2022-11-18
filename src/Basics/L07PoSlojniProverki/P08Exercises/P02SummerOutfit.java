package Basics.L07PoSlojniProverki.P08Exercises;

import java.util.Scanner;

public class P02SummerOutfit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int degrees = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();

        String outfit = ""; // тук пазим облеклото
        String shoes = ""; // тук пазим обувките

        switch (dayTime) {
            case "Morning":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";

                }
                break;
            case "Afternoon":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degrees >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";

                }
                break;
            case "Evening":

                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";

                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);

    }
}
