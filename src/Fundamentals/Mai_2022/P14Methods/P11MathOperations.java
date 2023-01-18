package Fundamentals.Mai_2022.P14Methods;
import java.util.Scanner;
public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        char ch = scan.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scan.nextLine());

        System.out.println(mathematics(firstNum,ch,secondNum));

    }

    public static int mathematics (int num1, char operator, int num2){
        int result = 0;

        switch (operator){
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
        }

        return result;
    }

}
