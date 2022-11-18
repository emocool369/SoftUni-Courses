package Exams.E15_16_06_2019;
import java.util.Scanner;
public class P01SeriesCalculator {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String nameSerial = scan.nextLine();
        int numSeasons = Integer.parseInt(scan.nextLine());
        int numEpisodes = Integer.parseInt(scan.nextLine());
        double episodeDuration = Double.parseDouble(scan.nextLine());

        double commercialDuration = episodeDuration * 0.2;
        double totalDuration = episodeDuration + commercialDuration;
        int additionalTimeSpecialEpisode = numSeasons * 10;

        double totalTime = totalDuration * numEpisodes * numSeasons + additionalTimeSpecialEpisode;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", nameSerial, Math.floor(totalTime));


    }
}
