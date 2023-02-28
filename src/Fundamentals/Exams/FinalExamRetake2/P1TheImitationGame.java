package Fundamentals.Exams.FinalExamRetake2;

import java.util.Scanner;

public class P1TheImitationGame {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scan.nextLine());

        String commands = scan.nextLine();

        while(!commands.equals("Decode")){

            String[] command = commands.split("\\|");
            String operation = command[0];

            switch (operation){
                case "Move":
                    int numberOfLetters = Integer.parseInt(command[1]);
                    String subString = input.substring(0, numberOfLetters);
                    input.delete(0, subString.length());
                    input.append(subString);
                    break;

                case "Insert":
                    int index = Integer.parseInt(command[1]);
                    String value = command[2];

                    input.insert(index, value);

                    break;
                case "ChangeAll":

                    String subString2 = command[1];
                    String replacement = command[2];

                    int start = 0;
                    int end = input.length();

                    while((start = input.indexOf(subString2, start)) != -1){
                        input.replace(start, start + subString2.length(), replacement);
                        start += replacement.length();
                    }

                    break;
            }


            commands = scan.nextLine();
        }

        System.out.println("The decrypted message is: " + input);
    }
}
