package Fundamentals.January_2023.P20MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class P2TheLift {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int peopleWaiting = Integer.parseInt(scan.nextLine());
        int[] lift = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < lift.length; i++) {

            if (lift[i] < 4) {
                int freeSpace = 4 - lift[i];

                if (peopleWaiting < 4) {
                    lift[i] = lift[i] + peopleWaiting;
                    peopleWaiting -= peopleWaiting;
                } else {
                    lift[i] = lift[i] + freeSpace;
                    peopleWaiting -= freeSpace;
                }

            } else {
                continue;
            }

        }
        boolean hasEmptySpots = false;
        if (peopleWaiting == 0) {
            for (int liftSpaces : lift) {
                if (liftSpaces < 4) {
                    hasEmptySpots = true;
                }
            }
            if (hasEmptySpots) {
                System.out.println("The lift has empty spots!");
            }
            for (int liftSpots : lift) {
                System.out.print(liftSpots + " ");
            }

        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
            for (int liftSpots : lift) {
                System.out.print(liftSpots + " ");
            }
        }

    }
}
