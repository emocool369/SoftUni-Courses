package Fundamentals.Mai_2022.P14Methods;
import java.util.Scanner;
public class P6CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());

        System.out.printf("%.0f", area(width, length));

    }
    public static double area (double width, double length){
        return width * length;
    }
}
