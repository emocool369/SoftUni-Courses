package Fundamentals.Mai_2022.P14Methods;
import java.util.Scanner;
public class Parameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        printNumbers(a,b);

    }
    public static void printNumbers(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", i);

        }
    }
}
