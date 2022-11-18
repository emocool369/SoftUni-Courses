package Exams.E15_16_06_2019;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cinemaCapacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        int numPeople = 0;
        int income = 0;

        int totalPeople = 0;

        while (!input.equals("Movie time!")) {

            numPeople = Integer.parseInt(input);

            totalPeople += numPeople;

            if (totalPeople > cinemaCapacity) {
                break;
            }
            if (numPeople % 3 == 0) {
                income += (numPeople * 5) - 5;
            } else {
                income += numPeople * 5;
            }




            input = scan.nextLine();

        }

        if (totalPeople > cinemaCapacity) {
            System.out.printf("The cinema is full.%n");
            System.out.printf("Cinema income - %d lv.", income);
        } else {
            System.out.printf("There are %d seats left in the cinema.%n", cinemaCapacity - totalPeople);
            System.out.printf("Cinema income - %d lv.", income);
        }

    }
}
