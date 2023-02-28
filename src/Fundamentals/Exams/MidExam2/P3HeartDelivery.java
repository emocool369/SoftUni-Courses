package Fundamentals.Exams.MidExam2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3HeartDelivery {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> houses = Arrays.stream(scan.nextLine().split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());


        int jump = 0;
        String commands = scan.nextLine();

        while (!commands.equals("Love!")) {

            String[] commandParts = commands.split(" ");


            String length = commandParts[1];
            boolean hadVD = false;


            jump = jump + Integer.parseInt(length);


            if (jump >= houses.size()) {
                jump = 0;

                if (houses.get(jump) == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", jump);
                    hadVD = true;

                } else {

                    houses.set(jump, houses.get(jump) - 2);
                }
            } else {
                if (houses.get(jump) == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", jump);
                    hadVD = true;

                } else {
                    houses.set(jump, houses.get(jump) - 2);
                }
            }

            if (!hadVD) {

                if (houses.get(jump) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", jump);

                }
            }


            commands = scan.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", jump);
        int counter = 0;
        for (
                int i = 0; i < houses.size(); i++) {
            if (houses.get(i) == 0) {
                counter++;
            }
        }
        if (counter == houses.size()) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", houses.size() - counter);
        }

    }
}
