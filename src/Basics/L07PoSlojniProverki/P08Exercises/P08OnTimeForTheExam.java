package Basics.L07PoSlojniProverki.P08Exercises;
import java.util.Scanner;
public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourExam = Integer.parseInt(scan.nextLine());
        int minuteExam = Integer.parseInt(scan.nextLine());
        int hourArrival = Integer.parseInt(scan.nextLine());
        int minuteArrival = Integer.parseInt(scan.nextLine());

        int totalMin = hourExam * 60 + minuteExam;
        int totalMinArrival = hourArrival * 60 + minuteArrival;

        int diff = totalMin - totalMinArrival;

        if (diff == 0){
            System.out.println("On time");
        } else if (diff > 0 && diff <= 30) {
            System.out.printf("On time%n%d minutes before the start", Math.abs(diff));
        }else if (diff < 0){
            diff = Math.abs(diff);
            System.out.println("Late");
            if (diff >= 60){
                hourExam = diff / 60;
                minuteExam = diff % 60;
                System.out.printf("%d:%02d hours after the start", hourExam, minuteExam);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        }else{
            System.out.println ("Early");
            if (diff >= 60){
                hourExam = diff / 60;
                minuteExam = diff % 60;
                System.out.printf("%d:%02d hours before the start", hourExam, minuteExam);
            }else{
                System.out.printf("%d minutes before the start", diff);
            }
        }

    }
}