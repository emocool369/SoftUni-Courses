package Basics.L04FirstStepInCoding.Excercises4Povtorenie.Lab_povtorenie;

import java.util.Scanner;

public class OzelenjavaneNaDvorove {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //вход колко кв метри ще бъдат озеленени
        //обща цена на кв метри
        //цена с отсъпка
        //отстъпка
        //печат цена с отсъпка

        double kvmetri = Double.parseDouble(scan.nextLine());

        double cenaKvmetri = kvmetri * 7.61;

        double otsupka = cenaKvmetri * 0.18;

        double cenaKvmetriSOtstupka = cenaKvmetri - otsupka;



        System.out.println("Thefinal price is: " + cenaKvmetriSOtstupka + " lv.");
        System.out.println("The discount is: " + otsupka + " lv.");
    }
}
