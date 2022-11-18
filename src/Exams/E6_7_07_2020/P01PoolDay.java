package Exams.E6_7_07_2020;
import java.util.Scanner;
public class P01PoolDay {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numPeople = Integer.parseInt(scan.nextLine());
        double taxEntry = Double.parseDouble(scan.nextLine());
        double priceShezlong = Double.parseDouble(scan.nextLine());
        double priceUmbrella = Double.parseDouble(scan.nextLine());

        double totalTaxEntry = numPeople * taxEntry;
        double neededShezlongs = Math.ceil(numPeople * 0.75);
        double totalPriceShezlongs = neededShezlongs * priceShezlong;
        double neededUmbrellas = Math.ceil(numPeople * 0.5);
        double totalPriceUmbrellas = neededUmbrellas * priceUmbrella;

        double totalPrice = totalTaxEntry + totalPriceShezlongs + totalPriceUmbrellas;

        System.out.printf("%.2f lv.", totalPrice);

    }
}
