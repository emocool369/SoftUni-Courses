package Basics.L04FirstStepInCoding.Excercises4Povtorenie.Lab_povtorenie;

import java.util.Scanner;

public class TextPlusChisla {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

        int age = Integer.parseInt(scanner.nextLine());

        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);

    }
}
