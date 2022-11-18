package Basics.L13NestedLoops.P14NestedLoopsEx2;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int allCountTickets = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidsCount = 0;

        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeat = Integer.parseInt(scan.nextLine());

            int countTickets = 0;

            String command = scan.nextLine();

            while (!command.equals("End")) {
                String typeTicket = command;

                allCountTickets++;
                countTickets++;

                switch (typeTicket) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidsCount++;
                        break;
                }
                if (freeSeat == countTickets) {
                    break;
                }

                command = scan.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, countTickets * 100.0 / freeSeat);
            input = scan.nextLine();
        }
        System.out.printf("Total tickets: %d%n", allCountTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCount * 100.0 / allCountTickets);
        System.out.printf("%.2f%% standard tickets.%n", standardCount * 100.0 / allCountTickets);
        System.out.printf("%.2f%% kids tickets.%n", kidsCount * 100.0 / allCountTickets);
    }
}
