package Fundamentals.Exams.FinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class P1WorldTravelerNotFinished {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> travel = Arrays.stream(scan.nextLine().split("")).collect(Collectors.toList());

        String commands = scan.nextLine();

        while (!commands.equals("Travel")) {
            // String[] parts = input.split("[,\\s\\-:\\?]");

            List<String> commandLine = Arrays.stream(commands.split("[\\s\\:]")).collect(Collectors.toList());

            String command = commandLine.get(0);

            switch (command) {
                case "Add":

                    travel.add(Integer.parseInt(commandLine.get(2)), commandLine.get(3));

                    System.out.println(travel.toString().replaceAll("[\\[\\],\\s]", ""));

                    break;
                case "Remove":

                    List<Character> charListWithinRemoveCase = new ArrayList<>();

                    for (String s : travel) {
                        for (char c : s.toCharArray()) {
                            charListWithinRemoveCase.add(c);
                        }
                    }

                    int repetitions = Integer.parseInt(commandLine.get(3)) - Integer.parseInt(commandLine.get(2));

                    for (int i = Integer.parseInt(commandLine.get(2)); i <= Integer.parseInt(commandLine.get(2)) + repetitions; i++) {
                        charListWithinRemoveCase.remove(Integer.parseInt(commandLine.get(2)));
                    }

                    travel.clear();

                    for (char c : charListWithinRemoveCase) {
                        travel.add(Character.toString(c));
                    }
                    System.out.println(travel.toString().replaceAll("[\\[\\],\\s]", ""));

                    break;
                case "Switch":
                    List<Character> charListWithinSwitchCase = new ArrayList<>();



                        if(travel.contains(commandLine.get(1))){
                            travel.remove(commandLine.get(1));
                        }


                    break;
            }


            commands = scan.nextLine();
        }
    }
}
