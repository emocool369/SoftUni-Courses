package Fundamentals.Exams.MidExam2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2ShoppingListWithLists {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> groceriesList = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());

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
                        groceriesList.add(0, grocery);
                    }


                    break;
                case "Unnecessary":
                    for (String item : groceriesList) {
                        if (item.equals(grocery)) {
                            groceriesList.remove(item);
                            break;
                        }
                    }

                    break;
                case "Correct":
                    String newItem = commandParts[2];
                    for (int i = 0; i < groceriesList.size(); i++) {
                        if (groceriesList.get(i).equals(grocery)) {
                            groceriesList.set(i, newItem);
                            break;
                        }
                    }

                    break;
                case "Rearrange":
                    isInTheList = false;

                    for (int i = 0; i < groceriesList.size(); i++) {
                        if (groceriesList.get(i).equals(grocery)) {
                            groceriesList.remove(i);
                            isInTheList = true;
                            break;
                        }
                    }
                    if (isInTheList) {

                        groceriesList.add(groceriesList.size(), grocery);
                    }


                    break;
            }


            commands = scan.nextLine();
        }


        for (int i = 0; i < groceriesList.size(); i++) {
            System.out.print(groceriesList.get(i));
            if (i < groceriesList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
