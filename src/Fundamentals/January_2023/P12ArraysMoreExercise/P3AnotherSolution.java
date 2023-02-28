package Fundamentals.January_2023.P12ArraysMoreExercise;

import java.util.Scanner;

public class P3AnotherSolution {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int first = 0;
        int second = 1;
        int third = second + first;

        for (int i = 0; i < num; i++) {
            first = second;
            second = third;
            third = first + second;
        }
        System.out.println(first);
    }
}
