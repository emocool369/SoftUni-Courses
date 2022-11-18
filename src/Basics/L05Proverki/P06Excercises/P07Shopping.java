package Basics.L05Proverki.P06Excercises;

import java.util.Scanner;

public class P07Shopping {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int numVideocads = Integer.parseInt(scan.nextLine());
        int numProcessors = Integer.parseInt(scan.nextLine());
        int numRam = Integer.parseInt(scan.nextLine());

        //numVideocards > numProcessors = 15% otstupka
        //1 Videocard = 250 lv/br
        //1 processor = 35% ot cenata na zakupenite videokarti
        //1 ram = 10 % ot cenata na zakupenite videokarti

        int totalPriceVideocards = numVideocads * 250;
        double totalPriceProcessors = numProcessors * totalPriceVideocards * 0.35;
        double totalPriceRam = numRam * totalPriceVideocards * 0.1;

        double totalAmount = totalPriceVideocards + totalPriceProcessors + totalPriceRam;

        if (numVideocads > numProcessors){
            totalAmount *= 0.85;
        }

        if (budget >= totalAmount){
            System.out.printf("You have %.2f leva left!", budget - totalAmount);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!", totalAmount - budget);
        }


        //"You have {остатъчен бюджет} leva left!"
        //"Not enough money! You need {нужна сума} leva more!"


    }
}
