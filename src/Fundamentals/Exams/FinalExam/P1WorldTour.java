package Fundamentals.Exams.FinalExam;

import java.util.Scanner;

public class P1WorldTour {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scan.nextLine());

        String commands = scan.nextLine();

        while (!"Travel".equals(commands)) {

            String[] commandParts = commands.split(":");

            String command = commandParts[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    String newDestination = commandParts[2];

                    if (index >= 0 && index < input.length()) {
                        input.insert(index, newDestination);
                    }
                    System.out.println(input);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);

                    if (startIndex >= 0 && endIndex < input.length() && startIndex < input.length() && endIndex >=0) {
                        input.delete(startIndex, endIndex + 1);
                    }
                    System.out.println(input);
                    break;
                case "Switch":

                    String oldString = commandParts[1];
                    String newString = commandParts[2];

                    int index1 = input.indexOf(oldString);
                    int index2 = input.indexOf(oldString) + oldString.length();

                    if(index1 < 0) {
                        System.out.println(input);
                        break;
                    }else{
                        input.replace(index1, index2, newString);
                        System.out.println(input);
                    }

                    break;
            }

            commands = scan.nextLine();

        }

        System.out.printf("Ready for world tour! Planned stops: %s", input);

    }
}
