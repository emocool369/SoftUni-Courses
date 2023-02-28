package Fundamentals.Exams.MidExam3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3Inventory {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        List<String> items = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());

        String commands = scan.nextLine();
        boolean isInTheList = false;

        while(!commands.equals("Craft!")){
            String[] commandParts = commands.split(" - ");
            String command = commandParts[0];
            String item = commandParts[1];

            switch (command){

                case "Collect":
                    isInTheList = false;
                    for(String newItem : items){
                        if(newItem.equals(item)){
                            isInTheList = true;
                            break;
                        }
                    }
                    if(!isInTheList){
                        items.add(item);
                    }
                    break;
                case "Drop":
                    isInTheList = false;
                    for(String newItem : items){
                        if(newItem.equals(item)){
                            isInTheList = true;
                            break;
                        }
                    }
                    if(isInTheList){
                        items.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] combinedItems = item.split(":");
                    String item1 = combinedItems[0];
                    String item2 = combinedItems[1];

                    int counter = 0;
                    isInTheList = false;
                    for (int i = 0; i < items.size(); i++) {
                        counter++;

                        if(items.get(i).equals(item1)){
                            isInTheList = true;
                            break;
                        }
                    }
                    if(isInTheList){
                        items.add(counter, item2);
                    }


                    break;
                case "Renew":
                    isInTheList = false;
                    for(String newItem : items){
                        if(newItem.equals(item)){
                            isInTheList = true;
                            break;
                        }
                    }
                    if(isInTheList){
                        items.remove(item);
                        items.add(items.size(), item);
                    }
                    break;
            }


            commands = scan.nextLine();
        }
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i));
            if (i < items.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
