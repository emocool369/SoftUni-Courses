package Fundamentals.Exams.MidExamRetake2;

import java.util.Arrays;
import java.util.Scanner;

public class P2TheLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());

        int[] elevator = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < elevator.length; i++) {

            if (elevator[i] == 0) {
                if (numberOfPeople < 4) {
                    elevator[i] = numberOfPeople;
                    numberOfPeople = 0;
                    break;
                } else if (numberOfPeople > 4) {
                    numberOfPeople = numberOfPeople - 4;
                    elevator[i] = 4;

                } else if (numberOfPeople == 4) {
                    elevator[i] = 4;
                    numberOfPeople = 0;
                    break;
                } else if (numberOfPeople == 0) {
                    break;
                }
            } else if (elevator[i] < 4) {
                if (elevator[i] + numberOfPeople < 4) {
                    elevator[i] = elevator[i] + numberOfPeople;
                    numberOfPeople = 0;
                    break;
                } else if (elevator[i] + numberOfPeople > 4) {
                    numberOfPeople = numberOfPeople + elevator[i] - 4;
                    elevator[i] = 4;
                } else if (elevator[i] + numberOfPeople == 4) {
                    elevator[i] = 4;
                    numberOfPeople = 0;
                    break;

                }

            } else if (elevator[i] == 4) {
                continue;
            }
        }
        if (numberOfPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", numberOfPeople);
        } else if (numberOfPeople == 0) {
            for (Integer spot : elevator) {
                if (spot < 4) {
                    System.out.println("The lift has empty spots!");
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(elevator).replaceAll("[\\[\\],]", ""));
    }
}
