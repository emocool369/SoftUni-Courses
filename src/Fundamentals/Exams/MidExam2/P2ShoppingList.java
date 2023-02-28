package Fundamentals.Exams.MidExam2;

import java.util.Arrays;
import java.util.Scanner;

public class P2ShoppingList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] groceriesList = scan.nextLine().split("!");

        String commands = scan.nextLine();

        boolean isInTheList = false;

        while (!commands.equals("Go Shopping!")) {

            String[] commandParts = commands.split(" ");

            String command = commandParts[0];
            String grocery = commandParts[1];

            switch (command) {
                case "Urgent":
                    isInTheList = false;
                    for (String item : groceriesList) {
                        if (item.equals(grocery)) {
                            isInTheList = true;
                            break;
                        }


                    }
                    if (!isInTheList) {
                        String[] newGroceriesList = new String[groceriesList.length + 1];
                        newGroceriesList[0] = grocery;
                        System.arraycopy(groceriesList, 0, newGroceriesList, 1, groceriesList.length);
                        groceriesList = newGroceriesList;
                    }

                    break;
                case "Unnecessary":
                    for (int i = 0; i < groceriesList.length; i++) {

                        if (groceriesList[i].equals(grocery)) {

                            for (int j = i; j < groceriesList.length - 1; j++) {
                                groceriesList[j] = groceriesList[j + 1];

                            }

                            String[] newGroceriesList2 = new String[groceriesList.length - 1];
                            System.arraycopy(groceriesList, 0, newGroceriesList2, 0, newGroceriesList2.length);
                            groceriesList = newGroceriesList2;

                        }
                    }

                    break;
                case "Correct":
                    String newItem = commandParts[2];
                    for (int i = 0; i < groceriesList.length; i++) {
                        if (groceriesList[i].equals(grocery)) {
                            groceriesList[i] = newItem;
                        }
                    }
                    break;
                case "Rearrange":
                    isInTheList = false;
                    for (int i = 0; i < groceriesList.length; i++) {
                        if (groceriesList[i].equals(grocery)) {
                            isInTheList = true;
                            break;
                        }
                    }



                    if (isInTheList) {
                        int counter = -1;
                        for (int j = 0; j < groceriesList.length; j++) {
                            if (!groceriesList[j].equals(grocery)) {
                                groceriesList[counter + 1] = groceriesList[j];
                                counter++;
                            }

                        }
                        groceriesList[groceriesList.length - 1] = grocery;
                    }

                    break;
            }

            commands = scan.nextLine();
        }

        for (int i = 0; i < groceriesList.length - 1; i++) {
            System.out.print(groceriesList[i] + ", ");

        }
        System.out.print(groceriesList[groceriesList.length-1]);
    }
}
