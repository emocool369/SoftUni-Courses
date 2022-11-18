package Exams;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int broiHora = Integer.parseInt(scan.nextLine());
        double taksaVhod = Double.parseDouble(scan.nextLine());
        double priceShezlong = Double.parseDouble(scan.nextLine());
        double priceChadar = Double.parseDouble(scan.nextLine());

        // taksa vhod
        double obshtoTaksaVhod = broiHora * taksaVhod;

        //broi shezlongi i cena za tjah
        double broiShezlongi = Math.ceil(broiHora * 0.75);
        double cenaShezlongi = broiShezlongi * priceShezlong;

        //broi chadari i cena za tjah
        double broiChadari = Math.ceil(broiHora * 0.5);
        double cenaChadari = broiChadari * priceChadar;

        double totalPrice = cenaShezlongi + cenaChadari + obshtoTaksaVhod;

       System.out.printf("%.2f lv.", totalPrice);


    }
}
