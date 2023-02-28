package Fundamentals.Exams.MidExamRetake3;

import java.util.Arrays;
import java.util.Scanner;

public class P3ManOWar {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        int[] pirateShip = Arrays.stream(scan.nextLine().split(">")).mapToInt(Integer::parseInt).toArray();


        int[] warShip = Arrays.stream(scan.nextLine().split(">")).mapToInt(Integer::parseInt).toArray();
        int maximumHealthSectionCapacity = Integer.parseInt(scan.nextLine());

        String commands = scan.nextLine();

        while(!commands.equals("Retire")){

            String[] commandParts = commands.split(" ");

            String command = commandParts[0];

            switch(command){
                case "Fire":
                    int index = Integer.parseInt(commandParts[1]);
                    int damage = Integer.parseInt(commandParts[2]);

                    if(index < 0 || index > warShip.length - 1){
                        break;
                    }else {
                        warShip[index] = warShip[index] - damage;
                    }

                    if(warShip[index] <= 0){
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    }

                    break;
                case "Defend":

                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    int damage2 = Integer.parseInt(commandParts[3]);

                    if(startIndex < 0 || endIndex > pirateShip.length -1){
                        break;
                    }else{
                        for (int i = startIndex; i <= endIndex ; i++) {
                            pirateShip[i] = pirateShip[i] - damage2;
                        }
                    }

                    for (int i = 0; i < pirateShip.length; i++) {
                        if(pirateShip[i] <= 0){
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }
                    }

                    break;
                case "Repair":
                    int index2 = Integer.parseInt(commandParts[1]);
                    int health = Integer.parseInt(commandParts[2]);

                    if(index2 < 0 || index2 > pirateShip.length - 1){
                        break;
                    }else{
                        pirateShip[index2] = pirateShip[index2] + health;
                        if(pirateShip[index2] > maximumHealthSectionCapacity){
                            pirateShip[index2] = maximumHealthSectionCapacity;
                        }
                    }

                    break;
                case "Status":

                    int counter = 0;

                    for (int i = 0; i < pirateShip.length; i++) {
                        if(pirateShip[i] < maximumHealthSectionCapacity * 0.2){
                            counter++;
                        }

                    }
                    System.out.printf("%d sections need repair.%n", counter);

                    break;
            }

            commands = scan.nextLine();
        }

        int sumPirateShip = 0;
        int sumWarShip = 0;

        for (int section : pirateShip){
            sumPirateShip += section;
        }

        for (int section : warShip){
            sumWarShip += section;
        }

        System.out.println("Pirate ship status: " + sumPirateShip);
        System.out.println("Warship status: " + sumWarShip);
    }
}
