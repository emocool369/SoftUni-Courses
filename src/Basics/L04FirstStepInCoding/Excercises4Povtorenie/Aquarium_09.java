package Basics.L04FirstStepInCoding.Excercises4Povtorenie;

import java.util.Scanner;

public class Aquarium_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        int volume = length * width * height;
        double volumeInLiters = volume * 0.001;

        double takenSpace = percent / 100.0;

        double neededLiters = volumeInLiters * (1 - takenSpace);

        System.out.println(neededLiters);

    }

}
