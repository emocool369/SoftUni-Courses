package Fundamentals.Exams.MidExamRetake;

import java.util.*;
import java.util.stream.Collectors;

public class P3MovingTargets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int result = 0;

        String command = scan.nextLine();

        while (!command.equals("End")) {
            String[] commandParts = command.split(" ");

            String commandType = commandParts[0];
            int index = Integer.parseInt(commandParts[1]);
            int powerValueRadius = Integer.parseInt(commandParts[2]);


            switch (commandType) {
                case "Shoot":
                    if (index < targets.size() && index >= 0) {

                        result = targets.get(index) - powerValueRadius;

                        if (result <= 0) {
                            targets.remove(index);
                        } else {
                            targets.set(index, result);
                        }
                    }
                    break;
                case "Add":

                    if (index < 0 || index >= targets.size()) {
                        //Alternative if (index >= 0 && index < targets.size())
                        //targets.add(index, powerValueRadius);
                        //else
                        //System.out.println("Invalid placement!");
                        System.out.println("Invalid placement!");
                    } else {
                        targets.add(index, powerValueRadius);
                    }

                    break;
                case "Strike":
                    if (index - powerValueRadius >= 0 && index + powerValueRadius < targets.size()) {
                        targets.remove(index - powerValueRadius);
                        targets.remove(index - powerValueRadius);
                        targets.remove(index - powerValueRadius);
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            command = scan.nextLine();
        }

        for (int i = 0; i < targets.size() - 1; i++) {
            System.out.printf("%d|", targets.get(i));
        }
        System.out.println(targets.get(targets.size() - 1));
    }
}
