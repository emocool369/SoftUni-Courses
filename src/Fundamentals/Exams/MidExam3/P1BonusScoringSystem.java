package Fundamentals.Exams.MidExam3;

import java.util.Scanner;

public class P1BonusScoringSystem {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scan.nextLine());
        int numberOfLectures = Integer.parseInt(scan.nextLine());
        int additionalBonus = Integer.parseInt(scan.nextLine());

        double bonus = 0;
        double maxBonus = 0;
        int attendedlectures = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            int attendance = Integer.parseInt(scan.nextLine());

            bonus = attendance * 1.0 / numberOfLectures * (5 + additionalBonus);

            if (bonus > maxBonus){
                maxBonus = bonus;
                attendedlectures = attendance;
            }

        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", attendedlectures);
    }
}
