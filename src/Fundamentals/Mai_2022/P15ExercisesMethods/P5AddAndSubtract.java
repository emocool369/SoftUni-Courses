package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class P5AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        int sum = sum(num1, num2);
        int subtract = subtract(sum, num3);

        System.out.println(subtract);

    }

    static public int sum(int n1, int n2) {

        return n1 + n2;


    }

    static public int subtract(int n1, int n2) {

        return n1 - n2;
    }

}
