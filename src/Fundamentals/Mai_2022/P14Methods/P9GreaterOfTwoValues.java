package Fundamentals.Mai_2022.P14Methods;
import java.util.Scanner;
public class P9GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        switch (input){
            case"int":
                int num1 = Integer.parseInt(scan.nextLine());
                int num2 = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(num1, num2));
                break;
            case"char":
                char char1 = scan.nextLine().charAt(0);
                char char2 = scan.nextLine().charAt(0);
                System.out.println(getMax(char1, char2));
                break;
            case"string":
                String name1 = scan.nextLine();
                String name2 = scan.nextLine();
                System.out.println(getMax(name1, name2));
                break;

        }

    }
    public static int getMax(int num1, int num2){
        if (num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }

    public static char getMax(char char1, char char2){
        if (char1 > char2){
            return char1;
        } else {
            return char2;
        }
    }

    public static String getMax(String name1, String name2){
       String result = "";

       if(name1.compareTo(name2) > 0){
           result = name1;
       } else {
           result = name2;
       }
return result;
    }

}
