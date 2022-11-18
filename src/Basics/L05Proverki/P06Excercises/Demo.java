package Basics.L05Proverki.P06Excercises;

public class Demo {

    public static void main (String[] args){

        int a = 5;
        int b = 7;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a > b);
        System.out.println(a >= b);

        System.out.println();

        String name = "SoftUni";
        String name1 = "SoftUni";

        System.out.println(name.equals(name1));
        System.out.println("SoftUni".equals("SoftUni"));

        System.out.println();

        int c = 5;
        boolean isPositive = c > 0;
        System.out.println(isPositive);

        System.out.println();

        int d = 0;

        if (d > 0){
            System.out.println("isPositive");
        } else if (d == 0) {
            System.out.println("iszero");
        } else {
            System.out.println("isNegative");
        }

        System.out.println();

        double up = Math.ceil(23.65);
        double down = Math.floor(14.12);
        double num = Math.abs(-23.33);

        System.out.println(up);
        System.out.println(down);
        System.out.println(num);

        System.out.println();

        double num3 = 12.346412;
        System.out.printf("%.2f", num3);
        System.out.printf("%.0f", num3);
    }

    }




