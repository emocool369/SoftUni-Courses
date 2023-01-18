package Fundamentals.September_2022.P11Arrays;
import java.util.Scanner;
public class P4ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputArray = scan.nextLine().split(" ");

        for (int i = 0; i < inputArray.length / 2; i++) {

            String oldElement = inputArray[i]; //a

            inputArray[i] = inputArray[inputArray.length - 1 - i]; //a->c
            inputArray[inputArray.length - 1 - i] = oldElement; //c->a


        }
        System.out.println(String.join(" ", inputArray));
    }
}

//for (int i=inputArray.length-1;i>=0;i--)
//{reversedArray[inputArray.lenght-i-1] = array[i];}