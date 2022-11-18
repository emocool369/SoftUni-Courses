package Basics.L05Proverki.AdditionalExcercises;

import java.util.Scanner;

public class P06FlowerShop {
public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int magnolii = Integer.parseInt(scan.nextLine());
    int zumbuili = Integer.parseInt(scan.nextLine());
    int roses = Integer.parseInt(scan.nextLine());
    int cactus = Integer.parseInt(scan.nextLine());
    double presentPrice = Double.parseDouble(scan.nextLine());

    double totalPrice = (magnolii * 3.25) + (zumbuili * 4) + (roses * 3.5) + (cactus * 8);
    double totalPriceAfterTaxes = totalPrice * 0.95;

    if (totalPriceAfterTaxes >= presentPrice){
        System.out.printf("She is left with %.0f leva.", Math.floor(totalPriceAfterTaxes - presentPrice));
    } else {
        System.out.printf("She will have to borrow %.0f leva.", Math.ceil(presentPrice - totalPriceAfterTaxes));
    }
}

}
