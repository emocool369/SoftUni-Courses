package Fundamentals.Exams.MidExamRetake2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3MemoryGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<String> elements = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        int moves = 0;

        String command = scan.nextLine();

        while (!command.equals("end")) {

            List<Integer> commandLine = Arrays.stream(command.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            Integer command1 = commandLine.get(0);
            Integer command2 = commandLine.get(1);


            moves++;


            if (command1 >= 0 && command2 >= 0 && command1 < elements.size() && command2 < elements.size() && command1 != command2) {
                if (elements.get(command1).equals(elements.get(command2))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", elements.get(command1));

                    if (command1 > command2) {
                        elements.remove(command1 * 1);
                        elements.remove(command2 * 1);
                    } else if (command1 < command2) {
                        elements.remove(command2 * 1);
                        elements.remove(command1 * 1);
                    }
                    if (elements.isEmpty()) {
                        System.out.printf("You have won in %d turns!", moves);
                        return;
                    }

                } else if (!elements.get(command1).equals(elements.get(command2))) {
                    System.out.println("Try again!");
                }


            } else {
                elements.add(elements.size() / 2, "-" + moves + "a");
                elements.add(elements.size() / 2 + 1, "-" + moves + "a");
                System.out.println("Invalid input! Adding additional elements to the board");


            }
            command = scan.nextLine();
        }


        if (!elements.isEmpty()) {
            System.out.println("Sorry you lose :(");
            for (String item : elements) {
                System.out.print(item + " ");
            }
        }
    }
}
