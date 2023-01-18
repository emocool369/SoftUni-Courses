package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P3Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberGuests = Integer.parseInt(scan.nextLine());
        String typeOfGuests = scan.nextLine();
        String dayOfTheWeek = scan.nextLine();

        double totalPrice = 0.0;

        if(numberGuests >= 100 && typeOfGuests.equals("Business")){
            numberGuests = numberGuests - 10;
        }


        switch (typeOfGuests){
            case "Students":

                if(dayOfTheWeek.equals("Friday")){
                    totalPrice = numberGuests * 8.45;
                }else if (dayOfTheWeek.equals("Saturday")){
                    totalPrice = numberGuests * 9.80;
                }else if (dayOfTheWeek.equals("Sunday")){
                    totalPrice = numberGuests * 10.46;
                }

                break;
            case "Business":
                if(dayOfTheWeek.equals("Friday")){
                    totalPrice = numberGuests * 10.90;
                }else if (dayOfTheWeek.equals("Saturday")){
                    totalPrice = numberGuests * 15.60;
                }else if (dayOfTheWeek.equals("Sunday")){
                    totalPrice = numberGuests * 16.00;
                }
                break;
            case "Regular":
                if(dayOfTheWeek.equals("Friday")){
                    totalPrice = numberGuests * 15.00;
                }else if (dayOfTheWeek.equals("Saturday")){
                    totalPrice = numberGuests * 20.00;
                }else if (dayOfTheWeek.equals("Sunday")){
                    totalPrice = numberGuests * 22.50;
                }
                break;
        }


        if(numberGuests >= 30 && typeOfGuests.equals("Students")){
            totalPrice = totalPrice * 0.85;
        }

        if(numberGuests >= 10 && numberGuests <= 20 && typeOfGuests.equals("Regular")){
            totalPrice = totalPrice * 0.95;
        }

        System.out.printf("Total price: %.2f", totalPrice);

    }
}
