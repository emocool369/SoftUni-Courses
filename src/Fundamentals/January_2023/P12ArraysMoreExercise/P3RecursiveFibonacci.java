package Fundamentals.January_2023.P12ArraysMoreExercise;

import java.util.Scanner;

public interface P3RecursiveFibonacci {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int[] fibonacci = new int[num];

        if(num <= 0){
            System.out.println(0);
            return;
        }

        if(num == 1){
            System.out.println(1);
            return;
        }

        for (int i = 0; i < num; i++) {
        if(i == 0 || i == 1){
            fibonacci[i] = 1;
        }else{
            fibonacci[i] = fibonacci[i-1] + fibonacci[i - 2];
        }
        }
        System.out.println(fibonacci[num-1]);
    }
}
