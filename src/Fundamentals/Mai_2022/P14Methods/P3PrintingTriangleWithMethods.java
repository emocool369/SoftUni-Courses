package Fundamentals.Mai_2022.P14Methods;
import java.util.Scanner;
public class P3PrintingTriangleWithMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        printingTriangle(num);
    }
    public static void printingTriangle(int num){
        for (int i = 1; i <= num; i++) {
            printingLine(1, i);
        }

        for (int i = num - 1; i >= 1 ; i--) {
            printingLine(1, i);
        }
    }

    public static void printingLine(int start, int end){
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
