package Basics.L07PoSlojniProverki.P08Exercises;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();




        switch (text) {
            case "SoftUni":
                System.out.println("SoftUni is university");
                break;
            case "Emo":
                System.out.println("This is my name");
                break;
            case "Banana":
                System.out.println("This is fruit");
                break;
            case "Peach":
                System.out.println("This is friut");
                break;
            case "Apple":
                System.out.println("This is fruit");
                break;
            case "Pears":
            case "Strawberry":
            case "Berry":
                System.out.println("This is fruit");
                break;
            default:
                System.out.println("Nothing");
                break;

        }

        switch (text) {
            case "SoftUni1" -> System.out.println("SoftUni is university1");
            case "Emo1" -> System.out.println("This is my name1");
            case "Banana1" -> System.out.println("This is fruit1");
            case "Peach1" -> System.out.println("This is friut1");
            case "Apple1" -> System.out.println("This is fruit1");
            case "Pears1", "Strawberry", "Berry" -> System.out.println("This is fruit1");
            default -> System.out.println("Nothing2");
        }

        int a = Integer.parseInt(scan.nextLine());
        if (a > 5) {
            if (a == 6) {
                System.out.println("Equals 6");
            } else if (a == 10) {
                System.out.println("more than");
            } else if (a > 7) {
                System.out.println("Equals 10");
            }
        } else {
            System.out.println("Invalid");
        }

        int num = Integer.parseInt(scan.nextLine());
        boolean isValid = (num > 20) && (num % 2 == 0);

        if (!isValid){
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }
}


