package Basics.L05Proverki.Lab;

import java.util.Scanner;

public class P03EvenorOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
