package Fundamentals.Exams.MidExamRetake;

import java.util.*;

public class P2ShootForTheWin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        String[] input = command.split(" ");
        int arraySize = input.length;
        int result = 0;
        int shotTargets = 0;

        int[] intArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            intArray[i] = Integer.parseInt(input[i]);
        }
        while (!command.equals("End")) {
            command = scan.nextLine();

            if(command.equals("End")){
                break;
            }

            if (Integer.parseInt(command) < arraySize) {
                int currentNum = intArray[Integer.parseInt(command)];
                int x = 0;

                for (Integer item : intArray) {

                    if (item > currentNum) {
                        if (item == -1){
                            x++;
                            continue;
                        }
                        result = item - currentNum;
                        intArray[x] = result;
                    } else if (item <= currentNum){
                        if (item == -1){
                            x++;
                            continue;
                        }
                        result = item + currentNum;
                        intArray[x] = result;
                    }
                    x++;
                }
                intArray[Integer.parseInt(command)] = -1;
                shotTargets ++;
            }
        }
        System.out.printf("Shot targets: %d -> ", shotTargets);

        for (Integer item : intArray){
            System.out.print(item + " ");
        }
    }
}
