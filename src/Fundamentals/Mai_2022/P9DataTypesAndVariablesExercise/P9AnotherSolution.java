package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P9AnotherSolution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int extractedSpiceYield = Integer.parseInt(scan.nextLine());
            int restAfterConsumption = 0;
            int days = 0;
            int sum = 0;

            while (extractedSpiceYield >= 100){

                restAfterConsumption = extractedSpiceYield - 26;
                days +=1; //days++;
                extractedSpiceYield = extractedSpiceYield - 10;
                sum += restAfterConsumption;

            }
            System.out.println(days);
            if (sum >= 26) {
                sum = sum - 26;
            }
            System.out.println(sum);

        }

    }



