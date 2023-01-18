package Fundamentals.Mai_2022.P12ArraysExercises;

import java.util.Scanner;
import java.util.Arrays;

public class P1Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] people = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            people[i] = scan.nextInt();
            sum += people[i];

        }

        System.out.print(Arrays.toString(people).replace("[", "").replace(",", "").replace("]",""));
        System.out.printf("%n%d", sum);


    }
}
