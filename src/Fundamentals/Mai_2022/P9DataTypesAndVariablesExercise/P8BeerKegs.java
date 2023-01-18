package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;
import java.util.Scanner;
public class P8BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        double currentVolume = Double.MIN_VALUE;
        String maxKegType = "";

        for (int keg = 1; keg <= n; keg++) {

            String kegType = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            //currentVolume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > currentVolume){
                currentVolume = volume;
                maxKegType = kegType;
            }
        }
        System.out.println(maxKegType);
    }
}
