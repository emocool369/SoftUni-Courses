package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;
import java.util.Scanner;
public class P3Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int p = Integer.parseInt(scan.nextLine());

        int courses = (int) Math.ceil((double) n / p);

        System.out.println(courses);
    }
}
