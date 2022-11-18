package Exams.E22_10_2022;

import java.util.Scanner;

public class P01Excursion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberPeopleInGroup = Integer.parseInt(scan.nextLine());
        int numberNights = Integer.parseInt(scan.nextLine());
        int numberTransportCards = Integer.parseInt(scan.nextLine());
        int numberMuseumTickets = Integer.parseInt(scan.nextLine());

        int totalPriceNights = numberNights * 20;
        double totalPriceTransportCards = numberTransportCards * 1.6;
        int totalPriceMuseumTickets = numberMuseumTickets * 6;

        double totalSumPer1Person = totalPriceNights + totalPriceTransportCards + totalPriceMuseumTickets;

        double totalSumForTheGroup = totalSumPer1Person * numberPeopleInGroup;

        double totalSumForTheGroupPlusAdditionalExpenses = totalSumForTheGroup * 1.25;

        System.out.printf("%.2f", totalSumForTheGroupPlusAdditionalExpenses);

    }
}
