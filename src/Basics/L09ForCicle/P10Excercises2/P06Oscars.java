package Basics.L09ForCicle.P10Excercises2;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameActor = scan.nextLine();
        double pointsAcademy = Double.parseDouble(scan.nextLine());
        int numberJudges = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= numberJudges; i++) {

            String nameJudge = scan.nextLine();
            double pointsJudge = Double.parseDouble(scan.nextLine());

            double givenPoints = (nameJudge.length() * pointsJudge) / 2;

            pointsAcademy += givenPoints;

            if (pointsAcademy >= 1250.5) {
                break;
            }

        }
        if (pointsAcademy >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, pointsAcademy);

        } else {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - pointsAcademy);
        }
    }
}




