package Basics.L13NestedLoops.P14NestedLoopsExercises;
import java.util.Scanner;
public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        for (int i = n; i <= m; i++) {
            int oddSum = 0;
            int evenSum = 0;

            int current = i;

            for (int j = 6; j >= 1; j--) { //отнася се за позицията на моята цифра, цифрата е 100005, позицията последната цифра 5, на 6та позиция
                int digit = current % 10; //100005456 % 10 = 6 - взимам последната цифра
                if (j % 2 == 0) { //ако моята позиция е четна
                    evenSum += digit;
                } else { //ако моята позиция на числото е нечетна
                    oddSum += digit;
                }
                current = current / 10; //100005456 / 10 = 100000545 - взимам числото без последната му цифра
            }
if (oddSum == evenSum) {
    System.out.print(i + " ");
}
        }

    }
}
