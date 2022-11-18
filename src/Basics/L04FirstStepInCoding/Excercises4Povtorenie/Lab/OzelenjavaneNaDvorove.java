package Basics.L04FirstStepInCoding.Excercises4Povtorenie.Lab;

import java.util.Scanner;

public class OzelenjavaneNaDvorove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());

        double totalPriceNoDiscount = area * 7.61;

        double discount = totalPriceNoDiscount * 0.18;

        double totalPrice = totalPriceNoDiscount - discount;

        System.out.printf("The final price is: %f lv.", totalPrice);
        System.out.printf("The discount is: %f lv.", discount);

    }
}
