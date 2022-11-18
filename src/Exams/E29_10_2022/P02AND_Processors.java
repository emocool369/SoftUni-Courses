package Exams.E29_10_2022;
import java.util.Scanner;
public class P02AND_Processors {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numProcessorsPlanned = Integer.parseInt(scan.nextLine());
        int numEmployees = Integer.parseInt(scan.nextLine());
        int workingDays = Integer.parseInt(scan.nextLine());

        int totalWorkingHours = numEmployees * workingDays * 8;
        double numProcessorsMade = Math.floor(totalWorkingHours / 3.0);

        if (numProcessorsMade < numProcessorsPlanned){
            double losses = (numProcessorsPlanned - numProcessorsMade) * 110.1;

            System.out.printf("Losses> -> %.2f BGN", losses);
        } else {
            double profit = (numProcessorsMade - numProcessorsPlanned) * 110.1;
            System.out.printf("Profit: -> %.2f BGN", profit);
        }
    }
}
