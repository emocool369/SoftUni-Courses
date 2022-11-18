package Basics.L13NestedLoops;

import java.util.Scanner;

public class P01Clock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int hour = 0; hour <= 23; hour++) {
            for (int min = 0; min <= 59; min++) {
                for (int sec = 0; sec <= 59; sec++){
                System.out.printf("%d:%02d:%02d%n", hour, min, sec);
            }
            }
        }

    }
}
