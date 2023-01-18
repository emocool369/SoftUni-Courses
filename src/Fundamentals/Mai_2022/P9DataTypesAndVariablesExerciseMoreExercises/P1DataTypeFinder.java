package Fundamentals.Mai_2022.P9DataTypesAndVariablesExerciseMoreExercises;
import java.util.Scanner;
public class P1DataTypeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();

        while(!type.equals("END")){
            Scanner input = new Scanner(type);

            if (input.hasNextBoolean()){
                System.out.printf("%s is boolean type%n", type);
            } else if (input.hasNextInt()){
                System.out.printf("%s is integer type%n", type);
            } else if (type.length() == 1){
                System.out.printf("%s is character type%n", type);
            } else if (input.hasNextDouble()){
                System.out.printf("%s is floating point type%n", type);
            } else if (input.hasNextLine()){
                System.out.printf("%s is string type%n", type);
            }
        type = scan.nextLine();
        }

    }
}
