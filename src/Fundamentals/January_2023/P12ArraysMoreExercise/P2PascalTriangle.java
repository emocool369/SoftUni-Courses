package Fundamentals.January_2023.P12ArraysMoreExercise;

import java.util.Scanner;

public class P2PascalTriangle {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int inputNum = Integer.parseInt(scan.nextLine());
        int [] num = {1};
        int counter = 1;

        for (int i = 0; i < inputNum; i++) {

            if (i == 0){
                System.out.println(1);
            }else if (i == 1){
                counter++;
                int[] temp = {1, 1};
                for(int num1 : temp){
                    System.out.print(num1 + " ");
                }
                num = temp;
            }else if (i > 1){
                counter++;
                int[] temp = new int[counter];
                temp [0] = num[0];
                temp[temp.length - 1] = num[num.length - 1];

                for (int j = 0; j < num.length - 1; j++) {
                    temp[j + 1] = num [j] + num[j + 1];
                }

                System.out.println();
                for(int num2 : temp){
                    System.out.print(num2 + " ");
                }

                num = temp;

            }
        }


    }
}
