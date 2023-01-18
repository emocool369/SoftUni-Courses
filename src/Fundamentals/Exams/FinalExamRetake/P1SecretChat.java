package Fundamentals.Exams.FinalExamRetake;
import java.util.*;
public class P1SecretChat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       StringBuilder input = new StringBuilder(scan.nextLine());

       String commands = scan.nextLine();

        while(!commands.equals("Reveal")){

            String[] command = commands.split(":\\|:");

            String commandType = command[0];
            String indexSubstring = command[1];




            switch (commandType){
                case "InsertSpace":
                input.insert(Integer.parseInt(indexSubstring), " ");
                    System.out.println(input.toString());
                    break;
                case "Reverse":

                if(input.indexOf(indexSubstring) != - 1){
                    int start = input.indexOf(indexSubstring);
                    int end = input.indexOf(indexSubstring) + indexSubstring.length();

                    String subString = input.substring(start, end);
                    StringBuilder reversed = new StringBuilder(subString);
                    reversed.reverse();

                    String attach = new String(reversed);
                    input.replace(start, end, attach);

                    System.out.println(input.toString());

                } else {
                    System.out.println("error");
                }

                    break;
                case "ChangeAll":
                    String replacement = command[2];
                    int start = 0;
                    int end = input.length();
                    while((start = input.indexOf(indexSubstring, start)) != -1){    //докато старт = резултат различен от -1, -1 става, когато не може да се намери събстринг
                        //input.indexOf(indexSubstring, start) - това търси в целия стрингбилдер събстринга и показва на кое число,индекс започва събстринга, напр тук 2,3,11
                        //когато вече няма повтаряне на събстринга, input.indexOf(indexSubstring, start) е равно на -1
                        input.replace(start, start + indexSubstring.length(), replacement);
                        start += replacement.length();                              //след като намерим събстринг и го заменим, увеличаваме стойността на старт с дължината
                                                                                    //на събстринга, за да търсим в следващото повтаряне на цикъла от позиция след събстринга
                    }
                    System.out.println(input.toString());

                    break;
            }


        commands = scan.nextLine();

        }

        System.out.println("You have a new text message: " + input);

    }

}
