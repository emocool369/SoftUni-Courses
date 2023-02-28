package Fundamentals.Exams.MidExamRetake3;
import java.util.*;
public class P1BlackFlag {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int daysPlunder = Integer.parseInt(scan.nextLine());
        int dailyPlunder = Integer.parseInt(scan.nextLine());
        double expectedPlunder = Double.parseDouble(scan.nextLine());

        int counterDays = 0;
        double sumPlunder = 0.0;

        for (int i = 1; i <= daysPlunder; i++) {
            counterDays++;


            if (counterDays % 3 == 0) {

                sumPlunder = sumPlunder + dailyPlunder + (dailyPlunder / 2.0);
            } else {
                sumPlunder += dailyPlunder;
            }
            if (counterDays % 5 == 0) {
                sumPlunder = sumPlunder - (sumPlunder * 0.3);
            }


        }

        if (sumPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", sumPlunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", sumPlunder / expectedPlunder * 100);
        }
    }
}
