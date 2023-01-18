package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int powerN = Integer.parseInt(scan.nextLine());
        int distanceM = Integer.parseInt(scan.nextLine());
        byte exhaustionFactorY = Byte.parseByte(scan.nextLine());

        int result = powerN;
        int pokes = 0;

        while (result >= distanceM) {
            result = result - distanceM;
            pokes += 1;

            if(result == powerN * 0.5) {
                if (exhaustionFactorY > 0) {
                    result = result / exhaustionFactorY;
                }
            }
        }
        System.out.println(result);
        System.out.println(pokes);
    }
}
