package Fundamentals.January_2023.P8DataTypesAndVariables;

import java.util.Scanner;

public class P5ConcatNames {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        String secondName = scan.nextLine();
        String delimiter = scan.nextLine();

        //System.out.println(firstName + delimiter + secondName);
        System.out.printf("%s%s%s",firstName,delimiter,secondName);

        String result = String.format("%s%S%s", firstName, delimiter, secondName);
        System.out.println(result);

    }
}
