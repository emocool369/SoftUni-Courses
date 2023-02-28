package Fundamentals.January_2023.P8DataTypesAndVariables;

import java.util.Scanner;

public class P8LowerOrUpper {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        char input = scan.nextLine().charAt(0);

        if (input >= 65 && input <= 90){ //(input >= 'A' && input <= 'Z')
            System.out.println("upper-case");
        }else{
            System.out.println("lower-case");
        }


        if(Character.isUpperCase(input)){
            System.out.println("upper-case");
        }else if (Character.isLowerCase(input)){
            System.out.println("lower-case");
        }

    }
}
