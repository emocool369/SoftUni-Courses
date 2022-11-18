package Basics.L05Proverki.Lab;

import java.util.Scanner;

public class P05Number100_200 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        //<100 Less than 100
        //100 - 200 Between 100 and 200
        //> 200 Greater than 200

        if (num < 100){
            System.out.println("Less than 100");
        } else if (num <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }


    }
}
