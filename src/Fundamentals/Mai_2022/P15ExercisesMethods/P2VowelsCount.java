package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class  P2VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine(); //String input = scan.nextLine().toLowerCase();

        //int countVowels = getVowelsCount(input)
        //System.out.println(countVowels );

        printVowelsCount(input);
        //System.out.println(getVowelsCount(input));

    }

    public static void printVowelsCount (String text){

        int digit = 0;

        for (int i = 0; i < text.length(); i++) { //for(char symbol : text.toCharArray(){
            //if(symbol == 'a' || symbo == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'){

            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'o' || text.charAt(i) == 'u' || text.charAt(i) == 'A' || text.charAt(i) == 'E'
                    || text.charAt(i) == 'O' || text.charAt(i) == 'U' || text.charAt(i) == 'i' || text.charAt(i) == 'I') {
            digit +=1;

            }

        }
        System.out.println(digit);
    }

    /*
      public static  int getVowelsCount (String text){

        int digit = 0;

        for (int i = 0; i < text.length(); i++) { //for(char symbol : text.toCharArray(){
            //if(symbol == 'a' || symbo == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'){

            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'o' || text.charAt(i) == 'u' || text.charAt(i) == 'A' || text.charAt(i) == 'E'
                    || text.charAt(i) == 'O' || text.charAt(i) == 'U' || text.charAt(i) == 'i' || text.charAt(i) == 'I') {
            digit +=1;

            }

        }
        return digit;
    }
     */
}
