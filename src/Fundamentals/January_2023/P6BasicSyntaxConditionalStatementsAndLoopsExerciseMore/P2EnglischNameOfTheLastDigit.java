package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExerciseMore;

import java.util.Scanner;

public class P2EnglischNameOfTheLastDigit {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        printText(num);
    }

    public static void printText(int num){
        int lastDigit = num % 10;
        String nameLastDigit = "";
        switch (lastDigit){
            case 1:
                nameLastDigit = "one";
                break;
            case 2:
                nameLastDigit = "two";
                break;
            case 3:
                nameLastDigit = "three";
                break;
            case 4:
                nameLastDigit = "four";
                break;
            case 5:
                nameLastDigit = "five";
                break;
            case 6:
                nameLastDigit = "six";
                break;
            case 7:
                nameLastDigit = "seven";
                break;
            case 8:
                nameLastDigit = "eight";
                break;
            case 9:
                nameLastDigit = "nine";
                break;
            case 0:
                nameLastDigit = "zero";
                break;
        }

        System.out.println(nameLastDigit);
    }
}
