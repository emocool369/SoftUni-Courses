package Fundamentals.January_2023.P8DataTypesAndVariables;

import java.util.Scanner;

public class P10WithBoolean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            int curentNum = i;
            int sum = 0;

            while (curentNum > 0) {
                sum = sum + (curentNum % 10);
                curentNum = curentNum / 10;
            }

            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;

            if (isSpecial) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }

    }
}

