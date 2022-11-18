package Basics.L07PoSlojniProverki.P08Exercises;
import java.util.Scanner;
public class P07HotelRoom {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double apartment = 0.0;
        double studio = 0.0;

        switch (month){
            case "May":
            case "October":
                apartment = nights * 65;
                studio = nights * 50;
                if (nights > 14){ // night > 7 && < 14
                    studio = studio * 0.7;
                    apartment = apartment * 0.9;
                } else if (nights > 7) {
                    studio = studio * 0.95;

                }
                break;
            case "June":
            case "September":
                apartment = nights * 68.7;
                studio = nights * 75.2;
                if (nights > 14){
                    studio = studio * 0.8;
                    apartment = apartment * 0.9;
                }
                break;
            case "July":
            case "August":
                apartment = nights * 77;
                studio = nights * 76;
                if (nights > 14){
                    apartment = apartment * 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}
