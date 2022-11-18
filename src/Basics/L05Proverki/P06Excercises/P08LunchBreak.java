package Basics.L05Proverki.P06Excercises;

import java.util.Scanner;

public class P08LunchBreak {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //vreme za objad = 1/8 vremeto za pochivka
        //vreme za otdih = 1/4 vremeto za pochivka

        String nameSerial = scan.nextLine();
        int durationEpisode = Integer.parseInt(scan.nextLine());
        int durationBreak = Integer.parseInt(scan.nextLine());

        double timeLunch = durationBreak * 0.125;
        double timeRelaxation = durationBreak * 0.25;

        double totalTime = durationEpisode + timeLunch + timeRelaxation;

        if (totalTime <= durationBreak){

            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameSerial, Math.ceil(durationBreak - totalTime));
        }else{

            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameSerial, Math.ceil(totalTime - durationBreak));
        }


        //"You have enough time to watch {име на сериал} and left with {останало време} minutes free time."
        //"You don't have enough time to watch {име на сериал}, you need {нужно време} more minutes."

    }

}
