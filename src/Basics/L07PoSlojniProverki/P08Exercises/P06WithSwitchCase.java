package Basics.L07PoSlojniProverki.P08Exercises;
import java.util.Scanner;
public class P06WithSwitchCase {





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int result = 0;
        String output = "";
        String oddOrEven = "";

        switch (operator) {
            case "+":
                result = N1 + N2;
                if (result % 2 == 0) {
                    oddOrEven = "even"; // четно
                } else {
                    oddOrEven = "odd"; // нечетно
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, oddOrEven);
                break;
            case "-":
                result = N1 - N2;
                if (result % 2 == 0) {
                    oddOrEven = "even"; // четно
                } else {
                    oddOrEven = "odd"; // нечетно
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, oddOrEven);
                break;
            case "*":
                result = N1 * N2;
                if (result % 2 == 0) {
                    oddOrEven = "even"; // четно
                } else {
                    oddOrEven = "odd"; // нечетно
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, oddOrEven);
                break;
            case "/":
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    double divideResult = (1.0 * N1) / N2;
                    System.out.printf("%d %s %d = %.2f", N1, operator, N2, divideResult);
                }
                break;
            case "%":
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    result = N1 % N2;
                    System.out.printf("%d %s %d = %d", N1, operator, N2, result);
                }
                break;

        }
    }
}