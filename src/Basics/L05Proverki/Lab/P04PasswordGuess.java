package Basics.L05Proverki.Lab;

import java.util.Scanner;

public class P04PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = "s3cr3t!P@ssw0rd";
        String input = scan.nextLine();

        if (input.equals(password)){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
