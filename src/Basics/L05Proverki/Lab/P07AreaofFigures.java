package Basics.L05Proverki.Lab;

import java.util.Scanner;

public class P07AreaofFigures {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        String typeFigure = scan.nextLine();

        double area = 0;
        if (typeFigure.equals("square")){
            double side = Double.parseDouble(scan.nextLine());

            area = side * side;



        } else if (typeFigure.equals("rectangle")){
            double lenght = Double.parseDouble(scan.nextLine());
            double width = Double.parseDouble(scan.nextLine());

            area = lenght * width;



        }else if (typeFigure.equals("circle")){
            double radius = Double.parseDouble(scan.nextLine());

            area = Math.PI * radius * radius;



        } else if (typeFigure.equals("triangle")) {
            double base = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());

            area = base * height / 2;


        }
        System.out.printf("%.3f", area);
    }
}
