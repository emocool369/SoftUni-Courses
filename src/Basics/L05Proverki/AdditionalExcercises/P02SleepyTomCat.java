package Basics.L05Proverki.AdditionalExcercises;

import java.util.Scanner;
public class P02SleepyTomCat {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int restDays = Integer.parseInt(scan.nextLine());

        int workingDays = 365 - restDays;

        int realTimeforGame = workingDays * 63 + restDays * 127;

        int difference = 30000 - realTimeforGame;

        int hours = difference / 60;
        int minutes = difference % 60;

        if (difference >= 0 ){
            System.out.printf("Tom sleeps well%n");
            System.out.printf ("%d hours and %d minutes less for play", hours, minutes);

        } else if (difference < 0) {
            System.out.printf ("Tom will run away%n");
            System.out.printf ("%d hours and %d minutes more for play", Math.abs(hours), Math.abs(minutes));

        }

    }
}
