package Exams.E22_10_2022;

import java.util.Scanner;

public class P06withBoolean_False {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        boolean counter = false;

        outerloop:
        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d > c; d--) {


                        int sum = a + b + c + d;
                        int multiplication = a * b * c * d;

                        if (sum == multiplication && n % 10 == 5) {
                           counter = true;
                            System.out.printf("%d%d%d%d", a, b, c, d);
                            break outerloop;


                        } else if (multiplication / sum == 3 && n % 3 == 0) {
                            counter = true;
                            System.out.print(d * 1000 + c * 100 + b * 10 + a);
                            break outerloop;

                        }

                    }

                }

            }
        }


        if (!counter) {
            System.out.println("Nothing found");
        }
    }
}