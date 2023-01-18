package Fundamentals.Mai_2022.P11Arrays;

import java.util.Scanner;

public class P1DaysOfWeek {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String[] daysOfWeek = new String[7];
//
//        daysOfWeek[0] = "Monday";
//        daysOfWeek[1] = "Tuesday";
//        daysOfWeek[2] = "Wednesday";
//        daysOfWeek[3] = "Thursday";
//        daysOfWeek[4] = "Friday";
//        daysOfWeek[5] = "Saturday";
//        daysOfWeek[6] = "Sunday";

        String[] days = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        String[] days2 = new String[]{
                "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        int n = Integer.parseInt(scan.nextLine());
        if (n >= 1 && n <= 7){
            System.out.println(days[n-1]);
        } else {
            System.out.println("Invalid day!");
        }

    }

}
