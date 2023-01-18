package Fundamentals.September_2022.P12ArraysExercise;
import java.util.Arrays;
import java.util.Scanner;
public class P9ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String commands = scan.nextLine();

        while(!commands.equals("end")){

           String[] commandParts = commands.split(" ");
           String commandType = commandParts[0];

            switch (commandType){
                case "swap":

                    int index1 = Integer.parseInt(commandParts[1]); // 3
                    int element1 = array[index1]; // числото, което стои на индекс 3 ->87
                    int index2 = Integer.parseInt(commandParts[2]); // 4
                    int element2 = array[index2]; // числото, което стои на индекс 4 ->42

                    array[index1] = element2; //87->42
                    array[index2] = element1; //42->87


                    break;
                case "multiply":
                    int index11 = Integer.parseInt(commandParts[1]); // 1
                    int element11 = array[index11]; // числото, което стои на индекс 1 ->23
                    int index21 = Integer.parseInt(commandParts[2]); // 2
                    int element21 = array[index21]; // числото, което стои на индекс 2 ->321

                    int multiplication = element11 * element21;

                    array[index11] = multiplication;


                    break;
                case "decrease":
                    for (int i = 0; i < array.length; i++) {
                        array[i] = array[i] - 1;

                    }

                    break;
            }
            commands = scan.nextLine();
        }

        System.out.println(Arrays.toString(array).replace("[", "").replace(",", "").replace("]",""));

    }
}
