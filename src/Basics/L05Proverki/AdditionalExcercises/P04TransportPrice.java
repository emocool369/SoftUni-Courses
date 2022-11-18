package Basics.L05Proverki.AdditionalExcercises;
import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();

        double totalCost = 0;

        if (n < 20) {
            if (dayTime.equals("day")) {
                totalCost = 0.7 + (n * 0.79);
            } else {
                totalCost = 0.7 + (n * 0.9);
            }
        }
            if (n >= 20 && n < 100) {
                totalCost = n * 0.09;

            }
            if (n >= 100) {
                totalCost = n * 0.06;
            }
            System.out.printf("%.2f", totalCost);

    }
}
