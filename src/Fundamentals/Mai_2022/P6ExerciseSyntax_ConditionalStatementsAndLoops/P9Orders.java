package Fundamentals.Mai_2022.P6ExerciseSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P9Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double pricePerCapsule = Double.parseDouble(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int capsulesCount = Integer.parseInt(scan.nextLine());

        double pricePerOrder = 0;
        double totalPrice = 0;

        for (int i = 1; i <= n ; i++) {
            pricePerOrder = pricePerCapsule * days * capsulesCount;

            totalPrice += pricePerOrder;

            System.out.printf("The price for the coffee is: $%.2f%n", pricePerOrder);

            if (i == n){
                break;
            }

            pricePerCapsule = Double.parseDouble(scan.nextLine());
            days = Integer.parseInt(scan.nextLine());
            capsulesCount = Integer.parseInt(scan.nextLine());

        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
