package Fundamentals.September_2022.P11Arrays;
import java.util.Scanner;
public class P1_DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int day = Integer.parseInt(scan.nextLine());

        if (day >= 1 && day <= 7){
            System.out.println(dayOfWeek[day - 1]);
            System.out.println(String.join(" ", dayOfWeek));
            System.out.println(String.join(" ", dayOfWeek[day - 1]));
        } else {
            System.out.println("Invalid day!");
        }

    }
}
