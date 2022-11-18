package Basics.L04FirstStepInCoding.Excercises4Povtorenie;

import java.util.Scanner;

public class Basketball_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int yearlyPrice = Integer.parseInt(scan.nextLine());

        double sneakers = yearlyPrice - (yearlyPrice * 0.4);
        double equipment = sneakers - (sneakers * 0.2);
        double ball = equipment * 0.25;
        double accessories = ball / 5;

        double totalAmount = yearlyPrice + sneakers + equipment + ball + accessories;

        System.out.println(totalAmount);

    }
}
