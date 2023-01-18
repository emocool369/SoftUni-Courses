package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class P7NXNMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        printNXN(num);
    }

    public static void printNXN (int num){

        for (int lines = 0; lines < num; lines++) {
            for (int rows = 0; rows < num; rows++) {
                System.out.print(num + " ");

            }
            System.out.println();
        }

    }

}
