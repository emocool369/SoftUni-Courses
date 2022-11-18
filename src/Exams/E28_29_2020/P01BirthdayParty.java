package Exams.E28_29_2020;
import java.util.Scanner;
public class P01BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double rentRoom = Double.parseDouble(scan.nextLine());

        double priceCake = rentRoom * 0.2;
        double priceDrinks = priceCake - (priceCake * 0.45);
        double priceAnimator = rentRoom / 3;

        double totalCost = rentRoom + priceCake + priceDrinks + priceAnimator;

        System.out.println(totalCost);


    }
}
