package Exams.E15_16_06_2019;

import java.util.Scanner;

public class P06AnotherSolutionWithoutM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameActor = scan.nextLine();
        double pointsAcademy = Double.parseDouble(scan.nextLine());
        int numJudges = Integer.parseInt(scan.nextLine());
        double totalPointsJudge = 0;


        for (int i = 1; i <= numJudges; i++) {


            String nameJudge = scan.nextLine();
            double pointsJudge = Double.parseDouble(scan.nextLine());


            int lengthName = nameJudge.length();

            totalPointsJudge = (lengthName * pointsJudge) / 2;

            pointsAcademy += totalPointsJudge;

            if (pointsAcademy > 1250.5) {
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


