package Fundamentals.January_2023.P11Arrays;

import java.util.Scanner;

public class P1DayOfWeek {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        if(input >= 1 && input <= 7){
            System.out.println(daysOfWeek[input-1]);
        }else{
            System.out.println("Invalid day!");
        }

    }
}
