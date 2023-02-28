package Fundamentals.January_2023.P12ArraysExercise;

import java.util.*;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] treasureChest = scan.nextLine().split("\\|");


        String commands = scan.nextLine();
        boolean isInTheChest = false;
        double averageGain = 0;
        int counter = 0;
        int sum = 0;

        while (!commands.equals("Yohoho!")) {

            String[] commandParts = commands.split(" ");

            String command = commandParts[0];

            switch (command) {
                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {
                        isInTheChest = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (commandParts[i].equals(treasureChest[j])) {
                                isInTheChest = true;
                                break;
                            }
                        }

                        if (!isInTheChest) {
                            String[] tempChest = new String[treasureChest.length + 1];
                            tempChest[0] = commandParts[i];
                            System.arraycopy(treasureChest, 0, tempChest, 1, treasureChest.length);
                            treasureChest = tempChest;
                        }

                    }


                    break;
                case "Drop":

                    int index = Integer.parseInt(commandParts[1]);

                    if (index < 0 || index > treasureChest.length - 1) {
                        break;
                    }

                    String dropItem = treasureChest[index];
                    for (int i = index; i < treasureChest.length - 1; i++) {

                        treasureChest[i] = treasureChest[i + 1];


                    }
                    treasureChest[treasureChest.length - 1] = dropItem;


                    break;
                case "Steal":

                    int numberStolenItems = Integer.parseInt(commandParts[1]);

                    if (numberStolenItems >= treasureChest.length) {
                        System.out.println(Arrays.toString(treasureChest).replace("[", "").replace("]", ""));
                        System.out.println("Failed treasure hunt.");
                        return;
                    } else {

                        for (int j = treasureChest.length - numberStolenItems; j < treasureChest.length; j++) {
                            if (j < treasureChest.length - 1) {
                                System.out.print(treasureChest[j] + ", ");
                            } else {
                                System.out.println(treasureChest[j]);
                            }
                        }

                        for (int i = 0; i < numberStolenItems; i++) {


                            String[] tempChest = new String[treasureChest.length - 1];

                            System.arraycopy(treasureChest, 0, tempChest, 0, treasureChest.length - 1);
                            treasureChest = tempChest;
                        }
                    }


                    break;
            }


            commands = scan.nextLine();
        }

        if (treasureChest.length > 0) {

            for (String item : treasureChest) {
                counter++;
                sum += item.length();


            }
        }

        averageGain = sum * 1.0 / counter;


        System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);

    }
}
