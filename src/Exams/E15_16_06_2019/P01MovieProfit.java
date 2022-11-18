package Exams.E15_16_06_2019;

import java.util.Scanner;

public class P01MovieProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameMovie = scan.nextLine();
        int numDays = Integer.parseInt(scan.nextLine());
        int numTickets = Integer.parseInt(scan.nextLine());
        double priceTicket = Double.parseDouble(scan.nextLine());
        int percentForTheCinema = Integer.parseInt(scan.nextLine());

        double priceTicketPerDay = numTickets * priceTicket;
        double incomeForTheNumDays = priceTicketPerDay * numDays;
        double incomePercent = incomeForTheNumDays * percentForTheCinema / 100;
        double totalIncome = incomeForTheNumDays - incomePercent;

        System.out.printf("The profit from the movie %s is %.2f lv.", nameMovie, totalIncome);



    }
}
