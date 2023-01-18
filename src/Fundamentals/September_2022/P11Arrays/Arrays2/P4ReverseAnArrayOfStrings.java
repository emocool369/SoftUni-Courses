package Fundamentals.September_2022.P11Arrays.Arrays2;
import java.util.Scanner;
public class P4ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");

        for (int i = 0; i < array.length / 2; i++) {
            String oldElement = array[i];

            array[i] = array[array.length - 1 -i];

            array[array.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", array));

    }
}
