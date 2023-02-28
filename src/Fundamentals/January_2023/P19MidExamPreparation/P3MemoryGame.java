package Fundamentals.January_2023.P19MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class P3MemoryGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] elements = scan.nextLine().split(" ");

        String commands = scan.nextLine();

        int counter = 0;

        while (!commands.equals("end")) {
            counter++;
            String[] commandParts = commands.split(" ");

            int index1 = Integer.parseInt(commandParts[0]);
            int index2 = Integer.parseInt(commandParts[1]);


            if (index1 == index2 || index1 < 0 || index2 < 0 || index1 > elements.length - 1 || index2 > elements.length - 1) {
                System.out.println("Invalid input! Adding additional elements to the board");

                String[] temp = new String[elements.length + 2];

                String addElement = "-" + counter + "a";

                System.arraycopy(elements, 0, temp, 0, elements.length);
                for (int i = temp.length - 1; i > temp.length / 2 - 1; i--) {
                    temp[i] = temp[i - 2];
                }
                temp[temp.length / 2 - 1] = addElement;
                temp[temp.length / 2] = addElement;

                elements = temp;

            } else {
                if (elements[index1].equals(elements[index2])) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", elements[index1]);

                    if (index1 > index2) {
                        String[] temp = new String[elements.length - 2];
                        for (int i = index1; i < elements.length - 1; i++) {
                            elements[i] = elements[i + 1];
                        }
                        for (int i = index2; i < elements.length - 1; i++) {
                            elements[i] = elements[i + 1];
                        }

                        System.arraycopy(elements, 0, temp, 0, temp.length);
                        elements = temp;
                    } else {
                        String[] temp = new String[elements.length - 2];
                        for (int i = index2; i < elements.length - 1; i++) {
                            elements[i] = elements[i + 1];
                        }
                        for (int i = index1; i < elements.length - 1; i++) {
                            elements[i] = elements[i + 1];
                        }

                        System.arraycopy(elements, 0, temp, 0, temp.length);
                        elements = temp;
                    }

                } else {
                    System.out.println("Try again!");


                }
            }

            if (elements.length == 0) {
                System.out.printf("You have won in %d turns!", counter);
                return;
            }
            commands = scan.nextLine();
        }


        if (elements.length > 0) {
            System.out.println("Sorry you lose :(");
            for (String element : elements) {
                System.out.print(element + " ");
            }
        }


    }
}
