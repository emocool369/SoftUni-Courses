package Basics.L04FirstStepInCoding.Excercises4Povtorenie.AdditionalExcercises;

import java.util.Scanner;

public class Weather_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String weather = new String(scan.nextLine());



        if (weather.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }

    }
}