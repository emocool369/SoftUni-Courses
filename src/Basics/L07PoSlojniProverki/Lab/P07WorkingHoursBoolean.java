package Basics.L07PoSlojniProverki.Lab;
import java.util.Scanner;
public class P07WorkingHoursBoolean {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();

        int hour = Integer.parseInt(scan.nextLine());
        boolean isWorkingDay = day.endsWith("Monday") || day.endsWith("Tuesday") || day.endsWith("Wednesday") || day.endsWith("Thursday")
                || day.endsWith("Friday") || day.endsWith("Saturday");

        boolean WorkingDays = hour >= 10 && hour <= 18;
        if (isWorkingDay && WorkingDays) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}

