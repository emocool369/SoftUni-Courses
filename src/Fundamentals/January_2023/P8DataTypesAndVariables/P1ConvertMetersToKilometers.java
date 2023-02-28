package Fundamentals.January_2023.P8DataTypesAndVariables;

import java.util.Scanner;

public class P1ConvertMetersToKilometers {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        short meters = Short.parseShort(scan.nextLine());
        double kilometers = meters / 1000.0;;


        System.out.printf("%.2f",kilometers);


    }
}
