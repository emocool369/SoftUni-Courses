package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class P4PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();

        boolean b1 = characters(password);
        boolean b2 = lettersAndDigits(password);
        boolean b3 = atLeast2Digits(password);

        if(b1 && b2 && b3){
            System.out.println("Password is valid");
        }
    }
    public static boolean characters (String password){

        if(password.length() < 6 || password.length() > 10){

            System.out.println("Password must be between 6 and 10 characters");
            return false;
        } else {
            return true;
        }

        //return password.length() >= 6 || password.length() <= 10; true
    }
    public static boolean lettersAndDigits (String password){

        for (int i = 0; i < password.length(); i++) {
            //for (char symbol:password.toCharArray()){
            //if(!Character.isLetterOrDigit(symbol)){
            //return false;
            //}}
            //return true;

            boolean digit = Character.isDigit(password.charAt(i));
            boolean letter = Character.isLetter(password.charAt(i));

            if (!(digit || letter)){
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
                return true;
    }
    public static boolean atLeast2Digits (String password){
        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            //for (char symbol : password.toCharArray()){
            //if(Character.isDigit(symbol)){

            boolean digit = Character.isDigit(password.charAt(i));

            if (digit){
                digitCount += 1;
            }
        }
        if(digitCount < 2){
            System.out.println("Password must have at least 2 digits");
            return false;
        } else {
            return true;
        }
    }
    //return digitCount >= 2; ->броя на цифрите по-голям от 2 ->true, в противен случай false
}
