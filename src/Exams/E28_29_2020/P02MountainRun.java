package Exams.E28_29_2020;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scan.nextLine());
        double distanceInMeters = Double.parseDouble(scan.nextLine());
        double timeForClimbing1mInSeconds = Double.parseDouble(scan.nextLine());

        double ClimbingSeconds = distanceInMeters * timeForClimbing1mInSeconds;

        double additionsSeconds = (Math.floor(distanceInMeters / 50)) * 30;

        double totalClimbingSeconds = ClimbingSeconds + additionsSeconds;

        if (totalClimbingSeconds >= recordInSeconds){
            System.out.printf("No! He was %.2f seconds slower.", totalClimbingSeconds - recordInSeconds);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", totalClimbingSeconds);
        }

    }
}
