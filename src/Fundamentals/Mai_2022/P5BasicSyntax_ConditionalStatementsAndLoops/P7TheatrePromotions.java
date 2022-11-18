package Fundamentals.Mai_2022.P5BasicSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P7TheatrePromotions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        int ticketPrice = 0;

        switch (day){
            case "Weekday":
                if (age >= 0 && age <= 18){
                    ticketPrice = 12;
                } else if (age > 18 && age <= 64){
                    ticketPrice = 18;
                } else if (age > 64 && age <= 122){
                    ticketPrice = 12;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18){
                    ticketPrice = 15;
                } else if (age > 18 && age <= 64){
                    ticketPrice = 20;
                } else if (age > 64 && age <= 122){
                    ticketPrice = 15;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18){
                    ticketPrice = 5;
                } else if (age > 18 && age <= 64){
                    ticketPrice = 12;
                } else if (age > 64 && age <= 122){
                    ticketPrice = 10;
                }

                break;
            default:
                System.out.println("Error!");
        }
        if (age < 0 || age > 122) {
            System.out.println("Error!");
        } else {
            System.out.println(ticketPrice + "$");
        }
    }
}
