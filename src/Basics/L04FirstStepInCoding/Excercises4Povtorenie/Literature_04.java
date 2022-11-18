package Basics.L04FirstStepInCoding.Excercises4Povtorenie;

import java.util.Scanner;

public class Literature_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bookPages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int totalTimePerBook = bookPages / pagesPerHour;
        int hoursPerDay = totalTimePerBook / days;

        System.out.println(hoursPerDay);

    }
}
