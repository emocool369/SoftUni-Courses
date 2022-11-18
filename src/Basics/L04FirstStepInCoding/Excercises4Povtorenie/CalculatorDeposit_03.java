package Basics.L04FirstStepInCoding.Excercises4Povtorenie;

import java.util.Scanner;

public class CalculatorDeposit_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int depositSum = Integer.parseInt(scan.nextLine());
        int depositTimeInMonths = Integer.parseInt(scan.nextLine());
        double yearlyPercent = Double.parseDouble(scan.nextLine());

        double interest = depositSum * (yearlyPercent/100);
        double monthlyInterest = interest / 12;
        double totalAmount = depositSum + (depositTimeInMonths * monthlyInterest);

        System.out.println(totalAmount);
        }

    }

