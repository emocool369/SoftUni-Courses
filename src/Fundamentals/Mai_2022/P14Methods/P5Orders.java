package Fundamentals.Mai_2022.P14Methods;
import java.util.Scanner;
public class P5Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());

        printCalculation(product,quantity);

    }

    public static void printCalculation (String input, int quantity){
        switch (input){
            case "coffee":
                System.out.printf("%.2f", (quantity * 1.5));

                break;
            case "water":
                System.out.printf("%.2f", (quantity * 1.0));
                break;
            case "coke":
                System.out.printf("%.2f", (quantity * 1.4));
                break;
            case "snacks":
                System.out.printf("%.2f", (quantity * 2.0));
                break;
        }
    }
}
