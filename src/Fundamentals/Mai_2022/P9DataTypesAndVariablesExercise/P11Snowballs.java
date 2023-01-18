package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;
import java.util.Scanner;
public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double snowballValue = 0;
        double previousSnowballValue = 0;
        int previousSnowballSnow = 0;
        int previousSnowballTime = 0;
        int previousSnowballQuality = 0;
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;

        for (int i = 1; i <= n; i++) {
            previousSnowballValue = snowballValue;
            previousSnowballQuality = snowballQuality;
            previousSnowballSnow = snowballSnow;
            previousSnowballTime = snowballTime;


            snowballSnow = Integer.parseInt(scan.nextLine());
            snowballTime = Integer.parseInt(scan.nextLine());
            snowballQuality = Integer.parseInt(scan.nextLine());

            snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (previousSnowballValue > snowballValue){
                snowballSnow = previousSnowballSnow;
                snowballTime = previousSnowballTime;
                snowballValue = previousSnowballValue;
                snowballQuality = previousSnowballQuality;
            } else {
                snowballSnow = snowballSnow;
                snowballTime = snowballTime;
                snowballValue = snowballValue;
                snowballQuality = snowballQuality;
            }

        }

        System.out.printf("%d : %d = %.0f (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);
    }
}
