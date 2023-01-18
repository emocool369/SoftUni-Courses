package Fundamentals.Mai_2022.P8DataTypesAndVariables;
import java.util.Scanner;
public class P1ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int meters = Integer.parseInt(scan.nextLine());
        //double kilometers = meters / 1000.0;
        System.out.printf("%.2f", (meters / 1000.0));
        //System.out.println("%.2f", kilometers);

    }
}
