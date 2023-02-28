package Fundamentals.January_2023.P8DataTypesAndVariables;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= num; i++) {

            int result = 0;
            if (i <= 9) {
                if (i == 5 || i == 7) {
                    System.out.printf(i + " -> True%n");
                } else {
                    System.out.printf(i + " -> False%n");
                }
            } else {
                int initialI = i;
                while (initialI > 0) {
                    int lastDigit = initialI % 10;
                    result += lastDigit;
                    initialI = initialI / 10;
                }
                if (result == 5 || result == 7 || result == 11) {
                    System.out.printf(i + " -> True%n");
                } else {
                    System.out.printf(i + " -> False%n");
                }
            }

        }
    }


}

