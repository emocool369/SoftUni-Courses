package Basics.L04FirstStepInCoding.Excercises4Povtorenie.AdditionalExcercises;

import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        //steni/zelena boja

        double steniOtpredIOtzad = ((x * x) * 2) - (2 * 1.2);
        double steniOtstrani = ((x * y) * 2) - ((1.5 * 1.5) * 2);

        double zelenaBojaLitri = (steniOtstrani + steniOtpredIOtzad) / 3.4;

        //pokriv/chervena boja

        double pravougulnizi = ((x * y) * 2);
        double triugulnik = ((x / 2) * h) * 2;

        double chervenaBojaLitri = (pravougulnizi + triugulnik) / 4.3;

        System.out.printf("%.2f", zelenaBojaLitri);
        System.out.println();
        System.out.printf("%.2f", chervenaBojaLitri);

    }
}
