package Exams.E15_16_06_2019;
import java.util.Scanner;
public class P03FilmPremiere {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nameMovie = scan.nextLine();
        String packageMovie = scan.nextLine();
        int numTickets = Integer.parseInt(scan.nextLine());

        double totalCost = 0;

        switch (nameMovie){
            case "John Wick":
                switch (packageMovie){
                    case "Drink":
                        totalCost = numTickets * 12;
                    break;
                        case "Popcorn":
                        totalCost = numTickets * 15;
                    break;
                        case "Menu":
                        totalCost = numTickets * 19;
                        break;
                }
                break;
            case "Star Wars":
                switch (packageMovie){
                    case "Drink":
                        totalCost = numTickets * 18;
                        break;
                    case "Popcorn":
                        totalCost = numTickets * 25;
                        break;
                    case "Menu":
                        totalCost = numTickets * 30;
                        break;
                }
                break;
            case "Jumanji":
                switch (packageMovie){
                    case "Drink":
                        totalCost = numTickets * 9;
                        break;
                    case "Popcorn":
                        totalCost = numTickets * 11;
                        break;
                    case "Menu":
                        totalCost = numTickets * 14;
                        break;
                }
                break;
        }

        if (nameMovie.equals("Star Wars") && numTickets >= 4){
            totalCost = totalCost - (totalCost * 0.3);
        }

        if (nameMovie.equals("Jumanji") && numTickets == 2){
            totalCost = totalCost - (totalCost * 0.15);
        }
        System.out.printf("Your bill is %.2f leva.", totalCost);
    }
}
