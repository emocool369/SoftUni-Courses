package Basics.L09ForCicle.P10Excercises2;





import java.util.Scanner;

public class P02AnotherSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //макс число
        //сума на всички
        //сума на останалите = сума на всички - макс число
        //проверка дали макс число = сума останалите
        int max = Integer.MIN_VALUE;
        int sumAll = 0;

        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sumAll = sumAll + value;
            if (value > max) {
                max = value;
            }

        }
        //максималното число
        //сумата на всички числа
        int sumOthers = sumAll - max;

        if (max == sumOthers) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(max - sumOthers));
        }
    }
}