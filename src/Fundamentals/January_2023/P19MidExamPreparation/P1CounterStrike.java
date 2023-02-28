package Fundamentals.January_2023.P19MidExamPreparation;

import java.util.Scanner;

public class P1CounterStrike {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scan.nextLine());
        int wonBattles = 0;

        String command = scan.nextLine();

        while(!command.equals("End of battle")){

            if(initialEnergy >= Integer.parseInt(command)){
                initialEnergy = initialEnergy - Integer.parseInt(command);
                wonBattles++;
            }else{
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, initialEnergy);
                return;
            }

            if(wonBattles % 3 == 0){
                initialEnergy = initialEnergy + wonBattles;
            }

            command = scan.nextLine();
        }

            System.out.printf("Won battles: %d. Energy left: %d", wonBattles,initialEnergy);

    }
}
