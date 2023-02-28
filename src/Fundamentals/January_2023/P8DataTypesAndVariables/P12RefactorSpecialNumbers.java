package Fundamentals.January_2023.P8DataTypesAndVariables;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());



        for (int ch = 1; ch <= num; ch++) {
           int currentNum = ch;
            int sum = 0;

            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) {
                System.out.printf("%d -> %s%n", ch, String.format("%s", isSpecial).substring(0,1).toUpperCase() +
                        String.format("%s", isSpecial).substring(1));
            }else {
                System.out.printf("%d -> %s%n", ch, String.format("%s", isSpecial).substring(0,1).toUpperCase() +
                        String.format("%s", isSpecial).substring(1));
            }

        }



    }
}
