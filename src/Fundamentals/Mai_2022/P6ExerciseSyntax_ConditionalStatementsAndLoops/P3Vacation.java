package Fundamentals.Mai_2022.P6ExerciseSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P3Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numStudents = Integer.parseInt(scan.nextLine());
        String typeOfPeople = scan.nextLine();
        String dayOfWeek = scan.nextLine();

        double price = 0;

        switch (typeOfPeople){
            case "Students":
                switch (dayOfWeek){
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.8;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.5;
                        break;
                }
                break;
        }
        if (numStudents >= 30 && typeOfPeople.equals("Students")){
            price = price * 0.85;
        } else if(numStudents >= 100 && typeOfPeople.equals("Business")) {
            numStudents = numStudents - 10;
        } else if(numStudents >= 10 && numStudents <= 20 && typeOfPeople.equals("Regular")) {
            price = price * 0.95;
        }
        System.out.printf("Total price: %.2f", numStudents * price);
    }
}
