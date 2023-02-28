package Fundamentals.January_2023.P8DataTypesAndVariables;

import java.util.Scanner;

public class P9CenturiesToMinutes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        byte centuries = Byte.parseByte(scan.nextLine());

        int years = centuries * 100;
        double days = years * 365.2422;
       // float days = (float) years * 365.2422f;
        double hours = days * 24;
        double minutes = hours * 60;


        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);

    }
}
