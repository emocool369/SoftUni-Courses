package Basics.L07PoSlojniProverki.P08Exercises;

import java.util.Scanner;

public class P01Cinema {

    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        String type = scan.nextLine();
        int r = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());


        double income = 0.00;

        switch (type){
            case "Premiere":
                income = r * c * 12.00;

                break;
            case "Normal":
                income = r * c * 7.50;

                break;
            case "Discount":
                income = r * c * 5.00;

                break;
        }
        System.out.printf("%.2f leva", income);
    }
}
