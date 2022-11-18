package Basics.L05Proverki.Lab;

import java.util.Scanner;

public class P01ExcellentResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grade = Integer.parseInt(scan.nextLine());

        boolean isExcellent = grade>= 5;

        if (grade >= 5){
            System.out.println("Excellent!");
            System.out.println("Bravo!");
        }
        if (isExcellent){
            System.out.println("Excellent2!");
        } else {
            System.out.println("Poor!");
        }
        String color = scan.nextLine();

        if (color.equals("red")) {
            System.out.println("tomato");
        } else {
            System.out.println("banana");
            System.out.println("bye");
        }


    }
}
