package Fundamentals.Mai_2022.P12ArraysExercises;
import java.util.Scanner;
import java.util.Arrays;
public class P4ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {

            String firstElement = array[0];

            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }

            array[array.length - 1] = firstElement;

        }
//for (String element: array) {
        //System.out.print(element + " ");}

        System.out.println(String.join(" ", array));
    }

}