package Fundamentals.January_2023.P9DataTypesAndVariableExercise;

import java.util.Scanner;

public class P10PokeMon {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scan.nextLine());
        int distanceBetweenPokeTargetsM = Integer.parseInt(scan.nextLine());
        int exhaustionFactorY = Integer.parseInt(scan.nextLine());

        int originalPokePowerN = pokePowerN;
        int counter = 0;

        while (pokePowerN >= distanceBetweenPokeTargetsM){
            pokePowerN = pokePowerN - distanceBetweenPokeTargetsM;
            counter++;

            if (originalPokePowerN * 0.5 == pokePowerN){
                if(exhaustionFactorY > 0) {
                    pokePowerN = pokePowerN / exhaustionFactorY;
                }
            }

        }
        System.out.println(pokePowerN);
        System.out.println(counter);

    }
}
