package Fundamentals.Mai_2022.P16Lists;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.stream.Collectors;

public class P4ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();

        while(!input.equals("end")){
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);

            int item = 0;
            int index = 0;
            switch (command){
                case "Add":
                    item = Integer.parseInt(commandLine.get(1));
                    numList.add(item);
                    break;
                case "Remove":
                    item = Integer.parseInt(commandLine.get(1));
                    numList.remove(Integer.valueOf(item));
                    break;
                case "RemoveAt":
                    item = Integer.parseInt(commandLine.get(1));
                    numList.remove(item);
                    break;
                case "Insert":
                    item = Integer.parseInt(commandLine.get(1));
                    index = Integer.parseInt(commandLine.get(2));
                    numList.add(index, item);
                    break;
            }

            input = scan.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
