package Fundamentals.Exams.MidExam;
import java.util.*;
public class P2ArrayModifier {

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);


        int[] numbersArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String commands = scan.nextLine();

        while(!commands.equals("end")){

            String[] commandParts = commands.split(" ");
            String commandType = commandParts[0];


            switch (commandType) {
                case "swap":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int element1 = numbersArray[index1];
                    int index2 = Integer.parseInt(commandParts[2]);
                    int element2 = numbersArray[index2];

                    numbersArray[index1] = element2;
                    numbersArray[index2] = element1;
                    break;

                case "multiply":
                    int index11 = Integer.parseInt(commandParts[1]);
                    int element11 = numbersArray[index11];
                    int index21 = Integer.parseInt(commandParts[2]);
                    int element21 = numbersArray[index21];

                    int result = element11 * element21;

                    numbersArray[index11] = result;
                    break;

                case "decrease":
                   /* for (Integer number : numbersArray) {

                        number = number - 1;
                    }*/

                    for (int i = 0; i < numbersArray.length; i++) {
                        numbersArray[i] = numbersArray[i] - 1;

                        break;
                    }

            }

            commands = scan.nextLine();
        }

        System.out.println(Arrays.toString(numbersArray).replace("[", "").replace("]", ""));

    }

}
