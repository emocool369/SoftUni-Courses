package Fundamentals.Exams.MidExam3;

import java.util.Scanner;

public class P2MuOnline {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int health = 100;
        int bitcoin = 0;

        String input = scan.nextLine();

        String[] rooms = input.split("\\|");
        String[][] roomsParts = new String[rooms.length][2];
        for (int i = 0; i < rooms.length; i++) {
            String[] parts = rooms[i].split(" ");
            roomsParts[i] = parts;
        }

        for (int i = 0; i < roomsParts.length; i++) {
            String roomsName = roomsParts[i][0];
            String roomsValue = roomsParts[i][1];

            switch (roomsName) {
                case "potion":
                    health = health + Integer.parseInt(roomsValue);
                    int actualHeal = Integer.parseInt(roomsValue);
                    if (health > 100) {
                        int difference = health - actualHeal;
                        actualHeal = 100 - difference;
                        health = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", actualHeal);
                    System.out.printf("Current health: %d hp.%n", health);

                    break;
                case "chest":
                    bitcoin = bitcoin + Integer.parseInt(roomsValue);
                    System.out.printf("You found %d bitcoins.%n", Integer.parseInt(roomsValue));
                    break;
                default:
                    health = health - Integer.parseInt(roomsValue);
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", roomsName);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", roomsName);
                        System.out.printf("Best room: %d", i+1);
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
