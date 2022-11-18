package Exams.E15_16_06_2019;

import java.util.Scanner;

public class P06FavoriteMovie {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int limitMovies = 0;
        String bestMovie = "";
        int bestSum = Integer.MIN_VALUE;

        while (!input.equals("STOP")) {
            int sum = 0;
            String movieName = input;

            limitMovies += 1;

            if (limitMovies == 7) {
                System.out.println("The limit is reached.");
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                int asciiValue = input.charAt(i);

                if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {
                    sum += input.charAt(i) - input.length();
                } else if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {
                    sum += input.charAt(i) - (input.length() * 2);
                } else {
                    sum += input.charAt(i);
                }

            }
            if (sum > bestSum){
                bestSum = sum;
                bestMovie = input;
            }




            input = scan.nextLine();

        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, bestSum);
    }
}
