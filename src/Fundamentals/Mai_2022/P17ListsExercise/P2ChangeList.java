package Fundamentals.Mai_2022.P17ListsExercise;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.stream.Collectors;

public class P2ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String values = scan.nextLine();

        List<Integer> intList = Arrays.stream(values.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("end")) {

            List<String> commandParts = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());

            switch (commandParts.get(0)) {
                case "Delete":
                    for (int i = 0; i < intList.size(); i++) {
                        if (Integer.parseInt(commandParts.get(1)) == intList.get(i)) {
                            intList.remove(intList.get(i));
                            if(i < intList.size() - 1){
                            i = - 1;
                        } else{
                                break;
                            }
                    }}

                    break;
                case "Insert":
                    intList.add(Integer.parseInt(commandParts.get(2)), Integer.parseInt(commandParts.get(1)));

                    break;
            }
            command = scan.nextLine();

        }

        System.out.println(intList.toString().replaceAll("[\\[\\],]", ""));
    }
}
