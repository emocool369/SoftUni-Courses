package Fundamentals.Mai_2022.P12ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P9ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine() //" 23 -2 321 87 42 90 -123"
                        .split(" ")) //["23","-2","321","87","42","90","-123"]
                .mapToInt(Integer::parseInt) //[23, -2, 321, 87, 42, 90, -123]
                .toArray();

        String command = scan.nextLine();
        //swap.split(" ") -> ["swap", "3", "4"]
        //multiply.split(" ") -> ["multiply", "3", "4"]
        //decrease.split(" ") -> ["decrease"]

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandType = commandParts[0]; //swap,multiply,decrease
            switch (commandType) {
                case "swap":
                    int index1 = Integer.parseInt(commandParts[1]); // 3
                    int element1 = numbers[index1]; // числото, което стои на индекс 3
                    int index2 = Integer.parseInt(commandParts[2]); // 4
                    int element2 = numbers[index2]; // числото, което стои на индекс 4

                    numbers[index1] = element2;
                    numbers[index2] = element1;

                    break;
                case "multiply":
                    int multiplyIndex1 = Integer.parseInt(commandParts[1]);
                    int multiplyElement1 = numbers[multiplyIndex1];
                    int multiplyIndex2 = Integer.parseInt(commandParts[2]);
                    int multiplyElement2 = numbers[multiplyIndex2];

                    int product = multiplyElement1 * multiplyElement2;
                    numbers[multiplyIndex1] = product;

                    break;
                case "decrease":

                    for (int index = 0; index <= numbers.length - 1; index++) {
                        numbers[index] -= 1; //numbers [index] = numbers [index] - 1;
                    }

                    break;
            }
            command = scan.nextLine();
        }

     //  System.out.println(Arrays.toString(numbers).replace("[", "".replace("]", "")));


        for (int index = 0; index <= numbers.length - 1; index++) {
            if (index != numbers.length - 1) {
                System.out.print(numbers[index] + ", ");
            } else {
                System.out.println(numbers[index]);
            }
        }
    }
}
