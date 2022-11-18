package Exams.E28_29_2020;

import java.util.Scanner;

public class P01ChangeBureau {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scan.nextLine());
        double youan = Double.parseDouble(scan.nextLine());
        double commision = Double.parseDouble(scan.nextLine());

        int levaBitcoin = bitcoin * 1168;
        double dollars = youan * 0.15;
        double levaDollars = dollars * 1.76;

        double totalLeva = levaBitcoin + levaDollars;

        double euro = totalLeva / 1.95;

        double amountCommision = euro * commision / 100;

        euro = euro - amountCommision;

        System.out.printf("%.2f", euro);


    }
}
