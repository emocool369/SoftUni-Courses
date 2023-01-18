package Fundamentals.Mai_2022.P14Methods;
import java.util.Scanner;
public class P1SignOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numInput = Integer.parseInt(scan.nextLine());

        signOfInteger(numInput);
    }
    public static void signOfInteger (int num){

        if (num > 0){
            System.out.printf("The number %d is positive.", num);
        } else if (num < 0){
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.println("The number 0 is zero.");

        }

    }
}
