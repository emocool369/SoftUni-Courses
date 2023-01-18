package Fundamentals.Mai_2022.P9DataTypesAndVariablesExerciseMoreExercises;

import java.util.Scanner;

public class P6BalancedBrackets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputLines = Integer.parseInt(scan.nextLine());
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < inputLines; i++) {

            String input = scan.nextLine();

            if ("(".equals(input)) {
                count1++;

            } else if (")".equals(input)) {
                count2++;

                if (count1 - count2 != 0) {
                    break;
                }
            }
        }
            if (count1 == count2) {
                System.out.println("BALANCED");
            } else {
                System.out.println("UNBALANCED");
            }
        }
    }