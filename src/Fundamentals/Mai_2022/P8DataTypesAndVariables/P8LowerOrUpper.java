package Fundamentals.Mai_2022.P8DataTypesAndVariables;
import java.util.Scanner;
public class P8LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char input = scan.nextLine().charAt(0);

//        if(input >= 'a' && input <= 'z'){
//            System.out.println("lower-case");
//        } else if (input >= 'A' && input <= 'Z'){
//            System.out.println("upper-case");
//        }
            if (Character.isLowerCase(input)){
                System.out.println("lower-case");
            } else if (Character.isUpperCase((input))){
                System.out.println("upper-case");
            }
    }
}
