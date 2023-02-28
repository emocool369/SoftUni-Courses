package Fundamentals.January_2023.P11Arrays;

import java.util.Scanner;

public class P4ReverseAnArrayOfStrings {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] strings = scan.nextLine().split(" ");

        for (int i = 0; i < strings.length / 2; i++) {
            String currentString = strings[i];

            strings[i] = strings[strings.length - 1 - i];

            strings[strings.length - 1 - i] = currentString;

        }

        System.out.println(String.join(" ", strings));
    }
}
