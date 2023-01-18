package Fundamentals.Mai_2022.P8DataTypesAndVariables;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Length: ");
        double lenght = Double.parseDouble(scan.nextLine());

        System.out.print("Width: ");
        double width = Double.parseDouble(scan.nextLine());

        System.out.print("Height: ");
        double height = Double.parseDouble(scan.nextLine());

        double volume = (lenght * width * height) / 3;

        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
