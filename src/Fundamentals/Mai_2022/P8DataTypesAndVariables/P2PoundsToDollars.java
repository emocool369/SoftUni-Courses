package Fundamentals.Mai_2022.P8DataTypesAndVariables;
import java.util.Scanner;
public class P2PoundsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pounds = Double.parseDouble(scan.nextLine());

        double dollars = pounds * 1.36;

        System.out.printf("%.3f", dollars);

    }
}
