package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P11AnotherSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int powerN = Integer.parseInt(scan.nextLine());
        int distanceM = Integer.parseInt(scan.nextLine());
        byte exhaustionFactorY = Byte.parseByte(scan.nextLine());


        int countPokes = 0;
        int startPower = powerN;

        while (powerN >= distanceM) {
            powerN -= distanceM;
            countPokes++;

            if (powerN == startPower * 0.5) {
                if (exhaustionFactorY > 0) {
                    powerN /= exhaustionFactorY;
                }

            }
        }
        System.out.println(powerN);
        System.out.println(countPokes);
    }
}
