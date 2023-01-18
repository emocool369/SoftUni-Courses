package Fundamentals.Mai_2022.P16Lists;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.stream.Collectors;

public class P5ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("end")) {
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);

            int item = 0;
            int index = 0;

            switch (command) {
                case "Contains":
                    if (numList.contains(Integer.parseInt(commandLine.get(1)))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandLine.get(1).equals("even")) {
                        for (int number : numList) {
                            if (number % 2 == 0) {
                                System.out.print(number + " ");

                            }}}

                            if (commandLine.get(1).equals("odd")) {
                                for (int number2 : numList) {
                                    if (number2 % 2 == 1) {
                                        System.out.print(number2 + " ");

                                    }
                                }
                            }
                    System.out.println();


                    break;

                case "Get":
                    int result = 0;
                    for (int i = 0; i < numList.size(); i++) {
                        result += numList.get(i);
                    }
                    System.out.println(result);
                    break;
                case "Filter":

                    if (commandLine.get(1).equals("<")) {
                        for (int number : numList) {
                            if (number < Integer.parseInt(commandLine.get(2))) {
                                System.out.print(number + " ");

                            }
                        }
                        System.out.println();
                    } else if (commandLine.get(1).equals(">")) {
                        for (int number : numList) {
                            if (number > Integer.parseInt(commandLine.get(2))) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandLine.get(1).equals(">=")) {
                        for (int number : numList) {
                            if (number >= Integer.parseInt(commandLine.get(2))) {
                                System.out.print(number + " ");
                            }
                        }

                    } else if (commandLine.get(1).equals("<=")) {
                        for (int number : numList) {
                            if (number <= Integer.parseInt(commandLine.get(2))) {
                                System.out.print(number + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
            }

            input = scan.nextLine();
        }

    }
}
