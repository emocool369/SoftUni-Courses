package Classes;

import java.util.Scanner;import java.util.*;

public class StringBuilderExample {





        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            java.lang.StringBuilder travel = new java.lang.StringBuilder(scan.nextLine());
            //String input;
            //while(!"Travel".equals(input = scan.nextLine());
            String commands = scan.nextLine();

            while (!commands.equals("Travel")) {
                String[] commandsLine = commands.split(":");
                if ("Add Stop".equals((commandsLine[0]))) {
                    int index = Integer.parseInt(commandsLine[1]);
                    if (index >= 0 && index < travel.length()) {
                        travel.insert(index, commandsLine[2]);
                    }
                    System.out.println(travel);
                } else if ("Remove Stop".equals(commandsLine[0])) {
                    int startIndex = Integer.parseInt(commandsLine[1]);
                    int endIndex = Integer.parseInt(commandsLine[2]);
                    if (startIndex >= 0 && endIndex >= 0 && startIndex < travel.length() && endIndex < travel.length()) {
                        travel.delete(startIndex, endIndex + 1);
                    }
                    System.out.println(travel);
                } else if ("Switch".equals(commandsLine[0])) {

                    int index = travel.indexOf(commandsLine[1]);
                    if (index < 0) {
                        break;
                    }
                    //String partOfTravel = travel.substring(index, index + commandsLine[1].length());


                    travel.replace(travel.indexOf(commandsLine[1]), travel.indexOf(commandsLine[1]) + commandsLine[1].length(), commandsLine[2]);
                    System.out.println(travel);
                } else {
                    break;
                }


                commands = scan.nextLine();

            }
            System.out.printf("Ready for world tour! Planned stops: %s", travel);
        }
    }

