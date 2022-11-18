package Basics.L04FirstStepInCoding.Excercises4Povtorenie.Lab;

import java.util.Scanner;

public class InchestoCentimetres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());

        double centimetres = inches * 2.54;

        System.out.println(centimetres);

    }
}
