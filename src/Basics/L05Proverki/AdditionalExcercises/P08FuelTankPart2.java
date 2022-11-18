package Basics.L05Proverki.AdditionalExcercises;
import java.util.Scanner;

public class P08FuelTankPart2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String typeFuel = scan.nextLine();
        double amountFuel = Double.parseDouble(scan.nextLine());
        String clubcard = scan.nextLine();

        double totalCost = 0;

        switch (typeFuel) {
            case ("Gasoline"):
                if (clubcard.equals("Yes") && amountFuel < 20) {
                    totalCost = amountFuel * (2.22 - 0.18);
                } else if (clubcard.equals("Yes") && amountFuel >= 20 && amountFuel <= 25) {
                    totalCost = (amountFuel * (2.22 - 0.18)) * 0.92;
                } else if (clubcard.equals("Yes") && amountFuel > 25) {
                    totalCost = (amountFuel * (2.22 - 0.18)) * 0.9;
                } else if (clubcard.equals("No") && amountFuel < 20) {
                    totalCost = amountFuel * 2.22;
                } else if (clubcard.equals("No") && amountFuel >= 20 && amountFuel <= 25) {
                    totalCost = amountFuel * 2.22 * 0.92;
                } else if (clubcard.equals("No") && amountFuel > 25) {
                    totalCost = amountFuel * 2.22 * 0.9;

                }
                break;
            case ("Diesel"):
                if (clubcard.equals("Yes") && amountFuel < 20) {
                    totalCost = amountFuel * (2.33 - 0.12);
                } else if (clubcard.equals("Yes") && amountFuel >= 20 && amountFuel <= 25) {
                    totalCost = (amountFuel * (2.33 - 0.12)) * 0.92;
                } else if (clubcard.equals("Yes") && amountFuel > 25) {
                    totalCost = (amountFuel * (2.33 - 0.12)) * 0.9;
                } else if (clubcard.equals("No") && amountFuel < 20) {
                    totalCost = amountFuel * 2.33;
                } else if (clubcard.equals("No") && amountFuel >= 20 && amountFuel <= 25) {
                    totalCost = amountFuel * 2.33 * 0.92;
                } else if (clubcard.equals("No") && amountFuel > 25) {
                    totalCost = amountFuel * 2.33 * 0.9;
                }
                break;
            case ("Gas"):
                if (clubcard.equals("Yes") && amountFuel < 20) {
                    totalCost = amountFuel * (0.93 - 0.08);
                } else if (clubcard.equals("Yes") && amountFuel >= 20 && amountFuel <= 25) {
                    totalCost = (amountFuel * (0.93 - 0.08)) * 0.92;
                } else if (clubcard.equals("Yes") && amountFuel > 25) {
                    totalCost = (amountFuel * (0.93 - 0.08)) * 0.9;
                } else if (clubcard.equals("No") && amountFuel < 20) {
                    totalCost = amountFuel * 0.93;
                } else if (clubcard.equals("No") && amountFuel >= 20 && amountFuel <= 25) {
                    totalCost = amountFuel * 0.93 * 0.92;
                } else if (clubcard.equals("No") && amountFuel > 25) {
                    totalCost = amountFuel * 0.93 * 0.9;
                }
                break;
        }
        System.out.printf("%.2f lv.", totalCost);
    }
}