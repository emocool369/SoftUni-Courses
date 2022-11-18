package Basics.L04FirstStepInCoding.Excercises4Povtorenie.AdditionalExcercises;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double width = w * 100;
        double height = h * 100;

        double desksInRow = Math.floor((height - 100) / 70);
        double rows = Math.floor(width / 120);

        double numberPlaces = (desksInRow * rows) - 3;

        System.out.println(numberPlaces);

    }
}

