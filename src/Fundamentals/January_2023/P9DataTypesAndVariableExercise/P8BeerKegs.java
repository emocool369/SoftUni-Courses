package Fundamentals.January_2023.P9DataTypesAndVariableExercise;

import java.util.Scanner;

public class P8BeerKegs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numberOfKegs = Integer.parseInt(scan.nextLine());
        String biggestKeg = "";
        double biggestKegVolume = 0;
        for (int i = 0; i < numberOfKegs; i++) {

            String modelKeg = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            double volume = Math.PI * (radius * radius) * height;


            if (volume > biggestKegVolume) {
                biggestKegVolume = volume;
                biggestKeg = modelKeg;
            }

        }
        System.out.println(biggestKeg);
    }


}
