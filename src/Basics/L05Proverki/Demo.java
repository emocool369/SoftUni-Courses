package Basics.L05Proverki;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = 5;
        int b = 7;

        System.out.println(a == b);
        System.out.println (a != b);
        System.out.println (a < b);
        System.out.println (a <= b);
        System.out.println (a > b);
        System.out.println (a >= b);


        String text = "Example";
        String textTwo = "Example2";
        String textThree = scan.nextLine();

        System.out.println(text == textThree);
        System.out.println(text.equals(textTwo));
        System.out.println(text.equals("Example"));

        int num = Integer.parseInt(scan.nextLine());


        boolean isValid = true;
        boolean isValid2 = num >10;

        System.out.println(isValid);
        System.out.println(isValid2);

        if (num > 5){
            System.out.println("Valid num");
        }

        double num2 = Double.parseDouble(scan.nextLine());
        System.out.printf("Chislo %.2f", num2);

        System.out.println();

        double up = Math.ceil(34.95764);
        System.out.println(up);

    }
}
