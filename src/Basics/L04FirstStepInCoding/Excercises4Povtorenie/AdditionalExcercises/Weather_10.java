package Basics.L04FirstStepInCoding.Excercises4Povtorenie.AdditionalExcercises;

import java.util.Scanner;

public class Weather_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double gradus = Double.parseDouble(scan.nextLine());

        if (gradus >= 26.0 && gradus <= 35.0){
            System.out.println("Hot");
        } else if (gradus >= 20.1 && gradus <= 25.9 ) {
            System.out.println("Warm");
        } else if (gradus >= 15 && gradus <= 20.0 ) {
            System.out.println("Mild");
        } else if (gradus >= 12.0 && gradus <= 14.9 ) {
            System.out.println("Cool");
        } else if (gradus >= 5.0 && gradus <= 11.9 ) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }

    }

    }

