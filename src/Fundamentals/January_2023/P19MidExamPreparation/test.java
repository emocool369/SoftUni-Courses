package Fundamentals.January_2023.P19MidExamPreparation;

import java.util.Scanner;

public class test {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] groceriesList = {"Tomatoes","Potatoes","Bread"};
        for (int i = 0; i < groceriesList.length; i++) {
            if (groceriesList[i].equals("Potatoes")) {
                for (int j = i; j < groceriesList.length - 1; j++) {
                    groceriesList[j] = groceriesList[j + 1];
                }
                break;
            }
        }
    }
}
