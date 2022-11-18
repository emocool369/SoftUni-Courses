package Basics.L05Proverki.P06Excercises;

import java.util.Scanner;

public class P06WorldSwimmingRecord {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scan.nextLine());
        double distanceInMeter = Double.parseDouble(scan.nextLine());
        double timeSwimmingof1Meter = Double.parseDouble(scan.nextLine());

        //на всеки 15 м с 12,5 сек, резултат math.down

        double ivansTime = distanceInMeter * timeSwimmingof1Meter;
        double suprotivlenieMeters = Math.floor(distanceInMeter / 15);
        double suprotivlenieSec = suprotivlenieMeters * 12.5;

        double totalIvansTime = ivansTime + suprotivlenieSec;

        if (totalIvansTime < recordInSec){

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalIvansTime);
        } else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalIvansTime - recordInSec);
        }




    }

}
