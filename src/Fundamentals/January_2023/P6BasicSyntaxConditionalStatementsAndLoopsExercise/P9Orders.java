package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P9Orders {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOrders = Integer.parseInt(scan.nextLine());
        double orderPrice = 0.0;
        double totalPrice = 0.0;

        for (int i = 1; i <= numberOrders ; i++) {
            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsuleCount = Integer.parseInt(scan.nextLine());


            orderPrice = pricePerCapsule * days * capsuleCount;

            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);

            totalPrice = totalPrice + orderPrice;
        }

        System.out.printf("Total: $%.2f", totalPrice);

    }
}
