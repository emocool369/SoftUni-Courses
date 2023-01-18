package Fundamentals.September_2022.P12ArraysExercise;
import java.util.Arrays;
import java.util.Scanner;
public class P1Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;

        int[] wagonsWithPeople = new int[n];

        for (int i = 0; i < n; i++) {
            wagonsWithPeople[i] = Integer.parseInt(scan.nextLine()); //scan.nextInt();
            sum +=wagonsWithPeople[i];
        }

        for (int i = 0; i < n; i++) {           //System.out.print(Arrays.toString(wagonsWithPeople).replace("[", "").replace(",", "").replace("]",""));
            System.out.print(wagonsWithPeople[i] + " ");

       }
        System.out.println();
        System.out.println(sum);
        System.out.print(Arrays.toString(wagonsWithPeople));
    }
}
