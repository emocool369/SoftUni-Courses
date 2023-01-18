package Fundamentals.Mai_2022.P17ListsExercise;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.stream.Collectors;

public class P3HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberGuests = Integer.parseInt(scan.nextLine());

        List<String> guests = new ArrayList<>();

        String command = scan.nextLine();

        for (int i = 0; i < numberGuests; i++) {

            List<String> commandParts = Arrays.stream(command.split(" ")).collect(Collectors.toList());


            if (commandParts.get(2).equals("going!")) {


                String name = commandParts.get(0);

                if (guests.contains(commandParts.get(0))) {

                    System.out.printf("%s is already in the list!%n",name);
                } else {
                    guests.add(commandParts.get(0));
                }


            } else if(commandParts.get(2).equals("not") && !guests.contains(commandParts.get(0))) {
                String name = commandParts.get(0);
                System.out.printf("%s is not in the list!%n", name);

            }else if(commandParts.get(2).equals("not") && guests.contains(commandParts.get(0))){
                guests.remove(commandParts.get(0));
            }

            if(i == numberGuests - 1){
                break;
            } else{
                command = scan.nextLine();
            }




        }

        for (int i = 0; i < guests.size(); i++) {
            System.out.println(guests.get(i));
        }
    }
}
