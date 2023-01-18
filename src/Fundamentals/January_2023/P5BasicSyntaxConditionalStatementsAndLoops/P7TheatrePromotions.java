package Fundamentals.January_2023.P5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P7TheatrePromotions {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String typeOfDay = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());


        switch (typeOfDay){
            case "Weekday":
                if(age >= 0 && age <= 18){
                    System.out.println(12+"$");
                }else if (age > 18 && age <= 64){
                System.out.println(18+"$");
            }else if (age > 64 && age <= 122) {
                    System.out.println(12 + "$");
                }else{
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if(age >= 0 && age <= 18){
                    System.out.println(15+"$");
                }else if (age > 18 && age <= 64){
                    System.out.println(20+"$");
                }else if (age > 64 && age <= 122) {
                    System.out.println(15 + "$");
                }else{
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if(age >= 0 && age <= 18){
                    System.out.println(5+"$");
                }else if (age > 18 && age <= 64){
                    System.out.println(12+"$");
                }else if (age > 64 && age <= 122) {
                    System.out.println(10 + "$");
                }else{
                    System.out.println("Error!");
                }
                break;
        }


    }
}
