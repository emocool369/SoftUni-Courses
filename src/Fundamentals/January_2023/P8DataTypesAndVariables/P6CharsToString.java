package Fundamentals.January_2023.P8DataTypesAndVariables;

import java.util.Scanner;

public class P6CharsToString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        char char1 = scan.nextLine().charAt(0);
        char char2 = scan.nextLine().charAt(0);
        char char3 = scan.nextLine().charAt(0);

        String result = String.format("%c%c%c", char1,char2, char3);
        System.out.println(result);
    }
}
