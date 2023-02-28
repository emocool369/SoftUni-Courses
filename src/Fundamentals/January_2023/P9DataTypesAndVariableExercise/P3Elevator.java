package Fundamentals.January_2023.P9DataTypesAndVariableExercise;

import java.util.Scanner;

public class P3Elevator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        int elevatorCapacity = Integer.parseInt(scan.nextLine());

        int numCourses = 0;

        while (numberOfPeople > 0){
            if (numberOfPeople < elevatorCapacity){
                numberOfPeople = 0;
                numCourses++;
                break;
            }
            int restPeople = numberOfPeople - elevatorCapacity;
            numberOfPeople = restPeople;
            numCourses++;


        }
        System.out.println(numCourses);
    }
}
