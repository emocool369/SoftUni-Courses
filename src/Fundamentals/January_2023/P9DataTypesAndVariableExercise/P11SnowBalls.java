package Fundamentals.January_2023.P9DataTypesAndVariableExercise;

import java.util.Scanner;

public class P11SnowBalls {

       public static void main(String[] args){
           Scanner scan = new Scanner(System.in);

           int numberOfSnowBalls = Integer.parseInt(scan.nextLine());

           double snowBallValue = 0;
           int bestSBN = 0;
           int bestSBT = 0;
           int bestSBQ = 0;
           double bestSBV = 0;

           for (int i = 1; i <= numberOfSnowBalls; i++) {
               int snowBallSnow = Integer.parseInt(scan.nextLine());
               int snowBallTime = Integer.parseInt(scan.nextLine());
               int snowBallQuality = Integer.parseInt(scan.nextLine());

               snowBallValue = Math.pow((snowBallSnow * 1.0 / snowBallTime), snowBallQuality);

               if (snowBallValue > bestSBV){
                   bestSBV = snowBallValue;
                   bestSBN = snowBallSnow;
                   bestSBT = snowBallTime;
                   bestSBQ = snowBallQuality;
               }

           }
           System.out.printf("%d : %d = %.0f (%d)", bestSBN, bestSBT, bestSBV, bestSBQ);
       }
}
