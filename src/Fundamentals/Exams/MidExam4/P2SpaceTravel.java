package Fundamentals.Exams.MidExam4;

import java.util.Scanner;

public class P2SpaceTravel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String travel = scan.nextLine();
        String[] routes = travel.split("\\|\\|");
        String[][] travelParts = new String[routes.length][2];
        for (int i = 0; i < travelParts.length; i++) {
            String[] parts = routes[i].split("\\s+");
            travelParts[i] = parts;
        }

        int fuel = Integer.parseInt(scan.nextLine());
        int ammunition = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < travelParts.length; i++) {
            String command = travelParts[i][0];

            switch (command) {
                case "Travel":
                    int lightYears = Integer.parseInt(travelParts[i][1]);
                    if (fuel >= lightYears) {
                        fuel = fuel - lightYears;
                        System.out.printf("The spaceship travelled %d light-years.%n", lightYears);
                        break;
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }


                case "Enemy":
                    int enemysArmor = Integer.parseInt(travelParts[i][1]);
                    if (ammunition >= enemysArmor) {
                        ammunition = ammunition - enemysArmor;
                        System.out.printf("An enemy with %d armour is defeated.%n", enemysArmor);
                    } else if (fuel >= enemysArmor * 2) {
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", enemysArmor);
                        fuel = fuel - enemysArmor * 2;
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;

                case "Repair":
                    int repair = Integer.parseInt(travelParts[i][1]);
                    fuel = fuel + repair;
                    ammunition = ammunition + (repair * 2);
                    System.out.printf("Ammunitions added: %d.%n", repair * 2);
                    System.out.printf("Fuel added: %d.%n", repair);
                    break;

                case "Titan":
                    System.out.println("You have reached Titan, all passengers are safe.");
                    break;

            }

        }
    }
}
