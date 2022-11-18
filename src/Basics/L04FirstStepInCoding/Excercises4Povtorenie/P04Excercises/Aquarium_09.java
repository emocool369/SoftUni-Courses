package Basics.L04FirstStepInCoding.Excercises4Povtorenie.P04Excercises;

import java.util.Scanner;

public class Aquarium_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int lenght = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        int obem = lenght * width * height;
        double obemLitri = obem * 0.001;
        double zaetoProstranstvo = percent / 100.0;

        double nujniLitri = obemLitri * (1 - zaetoProstranstvo);

        System.out.println(nujniLitri);

    }
}
