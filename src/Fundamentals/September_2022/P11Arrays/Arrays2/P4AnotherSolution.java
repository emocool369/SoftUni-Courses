package Fundamentals.September_2022.P11Arrays.Arrays2;
import java.util.Scanner;
public class P4AnotherSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");


        }


    }

}
