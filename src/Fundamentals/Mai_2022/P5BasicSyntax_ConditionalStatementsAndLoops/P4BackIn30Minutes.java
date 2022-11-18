package Fundamentals.Mai_2022.P5BasicSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P4BackIn30Minutes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

//        int hoursToMinutes = hours * 60;
//        int totalMinutes = minutes + hoursToMinutes;
//
//        int timeAfter30Min = totalMinutes + 30;

        int allMinutes = (hours * 60) + minutes + 30;

        int newHour = allMinutes / 60;
//        int newMinutes = allMinutes - (newHour * 60);
        int newMinutes = allMinutes % 60;

//        if (newHour == 24){
        if (newHour > 23){
            newHour = 0;
        }

        String result = String.format ("%d:%02d", newHour, newMinutes);

        System.out.println(result);
    }
}
