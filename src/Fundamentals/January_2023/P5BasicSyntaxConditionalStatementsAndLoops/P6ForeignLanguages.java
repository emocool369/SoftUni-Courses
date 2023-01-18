package Fundamentals.January_2023.P5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P6ForeignLanguages {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String countryName = scan.nextLine();

        switch (countryName){
            case "England":
            case"USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
