package Basics.L09ForCicle.P10Excercises2;
import java.util.Scanner;
public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numberTournaments = Integer.parseInt(scan.nextLine());
        int initialPoints = Integer.parseInt(scan.nextLine());
        int pointsPerTournament = 0;
        int wonTournaments = 0;

        for (int i = 1; i <= numberTournaments; i++){

            String etap = scan.nextLine();

            if (etap.equals("W")){
                initialPoints += 2000;
                pointsPerTournament += 2000;
                wonTournaments += 1;
            } else if (etap.equals("F")) {
                initialPoints += 1200;
                pointsPerTournament += 1200;
            } else if (etap.equals("SF")) {
                initialPoints +=720;
                pointsPerTournament +=720;
            }

        }
        int avaragePoints = pointsPerTournament / numberTournaments;

        System.out.printf("Final points: %d%n", initialPoints);
        System.out.printf("Average points: %d%n", avaragePoints);
        System.out.printf("%.2f%%", (wonTournaments * 1.0 / numberTournaments * 100));

    }
}
