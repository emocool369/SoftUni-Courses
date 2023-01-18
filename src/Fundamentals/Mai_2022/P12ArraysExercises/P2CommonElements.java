package Fundamentals.Mai_2022.P12ArraysExercises;
import java.util.Scanner;
import java.util.Arrays;
public class P2CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array1 = scan.nextLine().split(" ");
        String[] array2 = scan.nextLine().split(" ");

        for (int i = 0; i < array2.length; i++) {
            for(String item: array1){
                if(item.equals(array2[i]))
                System.out.print(array2[i] + " ");
            }

        }

    }
}
