package Basics.L04FirstStepInCoding.Excercises4Povtorenie.AdditionalExcercises;

import java.util.Scanner;
public class TrainingLabInMeters_05
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wNoHall = h - 1;

        double deskOnRow = Math.floor(wNoHall / 0.7);
        double totalRows = Math.floor(w / 1.20);

        double totalPlaces = (deskOnRow * totalRows) - 3;

        System.out.println(totalPlaces);

    }
}
