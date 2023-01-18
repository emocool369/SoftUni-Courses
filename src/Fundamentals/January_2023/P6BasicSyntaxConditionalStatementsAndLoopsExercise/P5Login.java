package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;
import java.util.*;

public class P5Login {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        int block = 0;

        char[] chars = username.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }

        String password = new String(chars);

        String enterPassword = scan.nextLine();

        while(!enterPassword.equals(password)){

            block ++;
            if (block == 4){
                System.out.printf("User %s blocked!",username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            enterPassword = scan.nextLine();
        }

        System.out.printf("User %s logged in.", username);
    }

}
