package Fundamentals.September_2022.P12ArraysExercise;

import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] items = scan.nextLine().split("\\|");

        String commands = scan.nextLine();

        while (!commands.equals("Yohoho!")) {
            String[] commandParts = commands.split(" ");

            switch (commandParts[0]) {
                case "Loot":

                    for (int i = 1; i < commandParts.length; i++) {
                        boolean alreadyContained = false;

                        for (int j = 0; j < items.length; j++) {
                            if (commandParts[i].equals(items[j])) {
                                alreadyContained = true;
                                break;
                            }
                        }
                        if (!alreadyContained) {
                            String newChest = commandParts[i] + " " + String.join(" ", items);
                            items = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(commandParts[1]);

                    if (position <= items.length - 1 && position >= 0) {

                        String dropItem = items[position];

                        for (int i = position; i < items.length - 1; i++) {
                            items[i] = items[i + 1];
                        }
                        items[items.length - 1] = dropItem;
                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    int numStolenItems = Integer.parseInt(commandParts[1]);

                    if (numStolenItems >= 0 && numStolenItems <= items.length) {
                        System.out.println();
                        for (int i = 0; i < numStolenItems; i++) {
                            System.out.print(items[items.length - numStolenItems + i]);
                            if (i != numStolenItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempChest = new String[items.length - numStolenItems];

                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = items[i];

                        }
                        items = tempChest;
                    }
                    System.out.println();
                    break;
            }
            commands = scan.nextLine();
        }
        String treasureCount = String.join("", items);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }
        double averageTreasure = (1.0 * charCounter) / items.length;
        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt");
        }
    }
}




