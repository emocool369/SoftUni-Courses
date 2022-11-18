package Basics.L05Proverki.AdditionalExcercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x = Integer.parseInt(scan.nextLine()); //kv.m. loze (40 % otivat za vino), (ot 1 kv m loze se izkarvat Y kg grozde)
        double y = Double.parseDouble(scan.nextLine()); //grozde za 1 kv m (za 1 l vino sa nujni 2,5 kg grozde)
        int z = Integer.parseInt(scan.nextLine()); //jelano kolichestvo in litri vino za prodan
        int numWorkers = Integer.parseInt(scan.nextLine());

        double totalGrape = (x * 0.4) * y;
        double totalLitersVine = totalGrape / 2.5;

        if (totalLitersVine >= z){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", totalLitersVine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(totalLitersVine - z), Math.ceil((totalLitersVine - z) / numWorkers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(z - totalLitersVine));
        }

    }

}
