package Basics.L04FirstStepInCoding.Excercises4Povtorenie.Lab_povtorenie;

import java.util.Scanner;

public class GreetubgsByName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
