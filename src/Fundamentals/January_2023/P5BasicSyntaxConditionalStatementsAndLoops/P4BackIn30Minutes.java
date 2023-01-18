package Fundamentals.January_2023.P5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P4BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int hoursIntoMinutes = hours * 60;

        int totalMinutes = hoursIntoMinutes + minutes;

        int timeAfter30Minutes = totalMinutes + 30;

        int hourAfter30Minutes = timeAfter30Minutes / 60;

        //int minutesAfter30Minutes = timeAfter30Minutes % 60;

        int minutesAfter30Minutes = timeAfter30Minutes - hourAfter30Minutes * 60;

        if(hourAfter30Minutes >= 24){
            hourAfter30Minutes = 0;
        }

        System.out.printf("%d:%02d", hourAfter30Minutes, minutesAfter30Minutes);


    }
}
