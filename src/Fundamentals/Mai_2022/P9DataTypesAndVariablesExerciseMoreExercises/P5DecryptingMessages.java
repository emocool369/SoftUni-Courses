package Fundamentals.Mai_2022.P9DataTypesAndVariablesExerciseMoreExercises;
import java.util.Scanner;
public class P5DecryptingMessages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        int numberLines = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= numberLines ; i++) {
            char letter = scan.nextLine().charAt(0);

            int decrypt = letter + key;

            System.out.print((char)decrypt);

        }


    }
}
