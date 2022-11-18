package Basics.L05Proverki.AdditionalExcercises;

import java.util.Scanner;

public class P07FuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeFuel = scan.nextLine();
        int liters = Integer.parseInt(scan.nextLine());


        switch (typeFuel) {
            case "Diesel":
            case "Gasoline":
            case "Gas":
                if (liters >= 25) {
                    System.out.printf("You have enough %s.", typeFuel.toLowerCase());

                } else {
                    System.out.printf("Fill your tank with %s!", typeFuel.toLowerCase());
                }
                break;
        }

            if (!typeFuel.equals("Diesel") && !typeFuel.equals("Gasoline") && !typeFuel.equals("Gas")){
                System.out.printf("Invalid fuel!", typeFuel);
        }
    }
}
