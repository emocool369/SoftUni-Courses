package Fundamentals.Exams.MidExamRetake2;

import java.util.Scanner;

public class P1ComputerStore {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double totalAmount = 0.0;
        double discountAmount = 0.0;

        String input = scan.nextLine();

        while (!(input.equals("special") || input.equals("regular"))) {

            double prices = Double.parseDouble(input);

            if (prices < 0) {
                System.out.println("Invalid price!");
            } else if (prices == 0) {
                System.out.println("Invalid order!");
            } else {
                totalAmount = totalAmount + prices;
            }


            input = scan.nextLine();

            if (input.equals("special")) {
                discountAmount = totalAmount * 1.2 * 0.9;
            } else if (input.equals("regular")) {
                discountAmount = totalAmount * 1.2;
            }
        }
        if (totalAmount == 0){
            System.out.println("Invalid order!");
        }else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalAmount);
            System.out.printf("Taxes: %.2f$%n", totalAmount * 0.2);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", discountAmount);
        }
    }
}
