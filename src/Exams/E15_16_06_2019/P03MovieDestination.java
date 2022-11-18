package Exams.E15_16_06_2019;

import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scan.nextLine());
        String destination = scan.nextLine();
        String season = scan.nextLine();
        int numberDays = Integer.parseInt(scan.nextLine());

        double movieCosts = 0.0;


        switch (destination) {
            case "Dubai":
                switch (season) {
                    case "Winter":
                        movieCosts = numberDays * 45000;
                        break;
                    case "Summer":
                        movieCosts = numberDays * 40000;
                        break;
                }
                break;
            case "Sofia":
                switch (season) {
                    case "Winter":
                        movieCosts = numberDays * 17000;
                        break;
                    case "Summer":
                        movieCosts = numberDays * 12500;
                        break;
                }
                    break;
            case "London":
                switch (season) {
                    case "Winter":
                        movieCosts = numberDays * 24000;
                        break;
                    case "Summer":
                        movieCosts = numberDays * 20250;
                        break;
                }
                break;

        }
        if (destination.equals("Dubai")){
            movieCosts = movieCosts - (movieCosts * 0.3);
        }

        if (destination.equals("Sofia")){
            movieCosts *= 1.25;
        }

        if (movieCosts > movieBudget){

            System.out.printf("The director needs %.2f leva more!", movieCosts - movieBudget);

        } else {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", movieBudget - movieCosts);
        }
    }
}
