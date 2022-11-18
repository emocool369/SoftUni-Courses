package Exams.E29_10_2022;

import java.util.Scanner;

public class P04GiftsFromSanta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int s = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= n; i++) {
            for (int j = n; j <= 10000; j++) {
                for (int k = m; k >= n; k--) {
                    if (k == s && s % 2 == 0 && s % 3 == 0) {
                        break;
                    }
                    if (k % 2 == 0 && k % 3 == 0) {

                        System.out.print(k + " ");
                    }
                }
                break;
            }
            break;
        }
    }
}
