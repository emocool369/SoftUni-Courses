package Basics.L04FirstStepInCoding.Excercises4Povtorenie.Lab_povtorenie;

import java.util.Scanner;

public class CheteneNaText {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        String lastName = scan.nextLine();

        System.out.println(firstName);
        System.out.println(lastName);

        int number = Integer.parseInt(scan.nextLine());
        System.out.println(number);

        double numberd = Double.parseDouble(scan.nextLine());
        System.out.println(numberd);

    }
}
