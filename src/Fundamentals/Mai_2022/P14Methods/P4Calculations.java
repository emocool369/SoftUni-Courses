package Fundamentals.Mai_2022.P14Methods;

import java.util.Scanner;

public class P4Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

        switch (input) {
            case "add":
                add(firstNum, secondNum);
                break;
            case "multiply":
                multiply(firstNum, secondNum);
                break;
            case "subtract":
                subtract(firstNum, secondNum);
                break;
            case "divide":
                divide(firstNum, secondNum);
                break;
        }

    }

    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void multiply(int num1, int num2) {
        int result = 0;
        result = num1 * num2;
        System.out.println(result);
    }

    public static void subtract(int num1, int num2) {

        int result = num1 - num2;
        System.out.println(result);
    }

    public static void divide(int num1, int num2) {
        int result = 0;
        result = num1 / num2;
        System.out.println(result);
    }
}
