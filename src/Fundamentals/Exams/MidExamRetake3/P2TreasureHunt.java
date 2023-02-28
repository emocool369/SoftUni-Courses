package Fundamentals.Exams.MidExamRetake3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class P2TreasureHunt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> treasureChest = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());

        String commands = scan.nextLine();
        boolean isInTheChest = false;

        while (!commands.equals("Yohoho!")) {

            String[] commandParts = commands.split(" ");

            String command = commandParts[0];

            switch (command) {
                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {
                        isInTheChest = false;
                        for (int j = 0; j < treasureChest.size(); j++) {
                            if (commandParts[i].equals(treasureChest.get(j))) {
                                isInTheChest = true;
                                break;
                            }
                        }
                        if (!isInTheChest) {
                            treasureChest.add(0, commandParts[i]);
                        }

                    }
                    break;
                case "Drop":

                    int index = Integer.parseInt(commandParts[1]);

                    if (index >= 0 && index <= treasureChest.size()-1) {

                        String dropItem = treasureChest.get(index);
                        treasureChest.remove(Integer.parseInt(commandParts[1]));
                        treasureChest.add(treasureChest.size(), dropItem);
                    } else {
                        break;
                    }

                    break;
                case "Steal":
                    List<String> stolenItems = new ArrayList<>();

                    int numberStolenItems = Integer.parseInt(commandParts[1]);

                    int stopCounting = treasureChest.size() - numberStolenItems;

                    if (numberStolenItems >= treasureChest.size()) {
                        stolenItems.addAll(treasureChest);
                        treasureChest.removeAll(treasureChest);

                    } else {
                        for (int i = treasureChest.size() - 1; i >= stopCounting; i--) {
                            stolenItems.add(0, treasureChest.get(i));
                            treasureChest.remove(treasureChest.get(i));
                        }
                    }


                    System.out.println(String.join(", ", stolenItems));


                    break;

            }
            commands = scan.nextLine();
        }

        if (treasureChest.size() == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            double sum = 0;
            int counterItems = 0;
            for (String item : treasureChest) {
                sum += item.length();
                counterItems++;
            }

            System.out.printf("Average treasure gain: %.2f pirate credits.", sum / counterItems);
        }
    }
}
