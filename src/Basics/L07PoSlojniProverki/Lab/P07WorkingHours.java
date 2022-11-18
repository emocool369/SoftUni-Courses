package Basics.L07PoSlojniProverki.Lab;
import java.util.Scanner;
public class P07WorkingHours {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int time = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();

        if (time >= 10 && time <= 18) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.printf("open");
                    break;
                case "Sunday":
                    System.out.printf("closed");
            }
        }else{
                System.out.printf("closed");
            }
        }

    }

