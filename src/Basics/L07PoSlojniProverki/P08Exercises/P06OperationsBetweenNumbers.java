package Basics.L07PoSlojniProverki.P08Exercises;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N1 = Integer.parseInt(scan.nextLine());
        int N2 = Integer.parseInt(scan.nextLine());
        String c = scan.nextLine();

        double result = 0;

        if (c.equals("+")) {
            result = N1 + N2;

            if (result % 2 == 0) {
                System.out.printf("%d + %d = %.0f - even", N1, N2, result);
            } else {
                System.out.printf("%d + %d = %.0f - odd", N1, N2, result);
            }

        } else if (c.equals("-")) {
            result = N1 - N2;

            if (result % 2 == 0) {
                System.out.printf("%d - %d = %.0f - even", N1, N2, result);
            } else {
                System.out.printf("%d - %d = %.0f - odd", N1, N2, result);

            }
        } else if (c.equals("*")) {
            result = N1 * N2;
            if (result % 2 == 0) {
                System.out.printf("%d * %d = %.0f - even", N1, N2, result);
            } else {
                System.out.printf("%d * %d = %.0f - odd", N1, N2, result);
            }
        } else if (c.equals("/")) {

            if (N2 == 0) {
                System.out.printf("Cannot divide %d by zero", N1);
            } else {
                double resultTwo = (1.0 * N1) / N2;

                System.out.printf("%d / %d = %.2f", N1, N2, resultTwo);

            }
        }else if (c.equals("%")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %d by zero", N1);
            }else {
                result = N1 % N2;

                System.out.printf("%d %% %d = %.0f", N1, N2, result);

            }



        }
    }
}

