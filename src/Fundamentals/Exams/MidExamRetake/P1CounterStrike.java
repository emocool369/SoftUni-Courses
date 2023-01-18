package Fundamentals.Exams.MidExamRetake;

import java.util.*;

public class P1CounterStrike {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scan.nextLine());
        int wonBattles = 0;
        int restEnergy = 0;
        String command = scan.nextLine();

        while(!command.equals("End of battle")){

            int distance = Integer.parseInt(command);

            if(distance > initialEnergy){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, initialEnergy);
                return;
            }
            restEnergy = initialEnergy - distance;
            initialEnergy = restEnergy;

            if(restEnergy >= 0){
                wonBattles++;

                if(wonBattles % 3 == 0){
                    initialEnergy = initialEnergy + wonBattles;
                }
            }

            command = scan.nextLine();
        }
        if(command.equals("End of battle")) {
            System.out.printf("Won battles: %d. Energy left: %d", wonBattles, initialEnergy);
        }
    }
}
