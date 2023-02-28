package Fundamentals.Exams.MidExam3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P2MuOnlineWithList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] rooms = input.split("\\|");
        List<String[]> roomsParts = new ArrayList<>();

        for (String item : rooms) {
            String[] parts = item.split(" ");
            roomsParts.add(parts);
        }

        int health = 100;
        int bitcoin = 0;

        for (int i = 0; i < roomsParts.size(); i++) {
            String roomName = roomsParts.get(i)[0];
            String roomValue = roomsParts.get(i)[1];

            switch (roomName) {
                case "potion":
                    health = health + Integer.parseInt(roomValue);
                    int actualHeal = Integer.parseInt(roomValue);
                    if (health > 100) {
                        int difference = health - actualHeal;
                        actualHeal = 100 - difference;
                        health = 100;

                    }
                    System.out.printf("You healed for %d hp.%n", actualHeal);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoin = bitcoin + Integer.parseInt(roomValue);
                    System.out.printf("You found %d bitcoins.%n", Integer.parseInt(roomValue));
                    break;
                default:
                    health = health - Integer.parseInt(roomValue);
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", roomName);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", roomName);
                        i = i + 1;
                        System.out.println("Best room: " + i);
                        return;
                    }
                    break;
            }

        }
        System.out.println("You've made it!");
        System.out.println("Bitcoins: " + bitcoin);
        System.out.println("Health: " + health);
    }

}
