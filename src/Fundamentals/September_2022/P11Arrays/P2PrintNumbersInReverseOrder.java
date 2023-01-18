package Fundamentals.September_2022.P11Arrays;
import java.util.Scanner;
public class P2PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] numbersArray = new int[n];

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            numbersArray[i] = currentNum;
        }
        for (int i = numbersArray.length - 1; i >= 0 ; i--) {
            System.out.printf("%d ", numbersArray[i]);

        }
    }
}
