package Exams.E15_16_06_2019;

import java.util.Scanner;

public class P02MovieDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int timeShooting = Integer.parseInt(scan.nextLine());
        int numScenes = Integer.parseInt(scan.nextLine());
        int durationScene = Integer.parseInt(scan.nextLine());

        double preparationTerrain = timeShooting * 0.15;
        int timeForShootingScenes = numScenes * durationScene;
        double neededTime = preparationTerrain + timeForShootingScenes;

        if (neededTime > timeShooting){

            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", neededTime - timeShooting);

        } else {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", timeShooting - neededTime);
        }




    }
}
