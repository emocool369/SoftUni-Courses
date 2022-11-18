package Exams.E15_16_06_2019;
import java.util.Scanner;
public class P05Oscars {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nameActor = scan.nextLine();
        double pointsAcademy = Double.parseDouble(scan.nextLine());
        int numJudges = Integer.parseInt(scan.nextLine());
        double totalPointsJudge = 0;
        double totalPoints = 0;

        int m = 1;

        for (int i = 1; i <= numJudges; i++) {

            m += 1;

            String nameJudge = scan.nextLine();
            double pointsJudge = Double.parseDouble(scan.nextLine());


            int lengthName = nameJudge.length();

            totalPointsJudge = (lengthName * pointsJudge) / 2;

            if (m == 2) {
                totalPoints = pointsAcademy + totalPointsJudge;
            } else {
                totalPoints = totalPoints + totalPointsJudge;
            }

            if (totalPoints > 1250.5){
                break;
            }
        }

        if (totalPoints >= 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor,1250.5 - totalPoints);
        }

    }
}
