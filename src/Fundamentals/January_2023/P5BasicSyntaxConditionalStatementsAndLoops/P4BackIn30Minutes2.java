package Fundamentals.January_2023.P5BasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;
public class P4BackIn30Minutes2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int minutesAfter30Minutes = minutes + 30;

        if(minutesAfter30Minutes > 59){
            hours++;
            minutes = minutesAfter30Minutes - 60;
        }else{
            minutes += 30;
        }

        if(hours >= 24){
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
