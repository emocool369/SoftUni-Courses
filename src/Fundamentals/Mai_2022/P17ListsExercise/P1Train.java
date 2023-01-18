package Fundamentals.Mai_2022.P17ListsExercise;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.stream.Collectors;
public class P1Train {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String wagonList = scan.nextLine();

        List<Integer> wagonPassengers = Arrays.stream(wagonList.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int wagonMaxCapacity = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();

        while(!command.equals("end")){

            List<String> commandPart = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());

            if (commandPart.get(0).equals("Add")){

                wagonPassengers.add(Integer.parseInt(commandPart.get(1)));

            } else {


                for (int i = 0; i < wagonPassengers.size(); i++) {

                    if (wagonPassengers.get(i) + Integer.parseInt(commandPart.get(0)) <= wagonMaxCapacity) {
                        wagonPassengers.set(i, wagonPassengers.get(i) + Integer.parseInt(commandPart.get(0)));

                        if(wagonPassengers.get(i) <= wagonMaxCapacity){
                            i = -1;
                        }else{
                            i = i;
                        }

                        break;
                    }

                }
            }
            command = scan.nextLine();


        }
        System.out.println(wagonPassengers.toString().replaceAll("[\\[\\],]", ""));

    }
}
