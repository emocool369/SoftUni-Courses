package Exams;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int numberNights = Integer.parseInt(scan.nextLine());
        double pricePerNight = Double.parseDouble(scan.nextLine());
        int percentAdditionalExpenses = Integer.parseInt(scan.nextLine());


        if (numberNights > 7) {
            pricePerNight = pricePerNight * 0.95;
        }
            double totalPriceNights = numberNights * pricePerNight;
            double totalAmount = totalPriceNights + (budget * (percentAdditionalExpenses / 100.0));

        if (budget >= totalAmount){

            double rest = budget - totalAmount;
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", rest);

        } else {

                double rest = totalAmount - budget;
                System.out.printf("%.2f leva needed.", rest);

            }
        }
    }

