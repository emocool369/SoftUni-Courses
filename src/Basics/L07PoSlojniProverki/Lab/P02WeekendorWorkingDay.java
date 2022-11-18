package Basics.L07PoSlojniProverki.Lab;
import java.util.Scanner;
public class P02WeekendorWorkingDay {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String dayOfWeek = scan.nextLine();

        switch (dayOfWeek){
            case "Monday" -> System.out.println("Working day");
            case "Tuesday" -> System.out.println("Working day");
            case "Wednesday" -> System.out.println("Working day");
            case "Thursday" -> System.out.println("Working day");
            case "Friday" -> System.out.println("Working day");
            case "Saturday" -> System.out.println("Weekend");
            case "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Error");
        }
    }
}
