package Fundamentals.Mai_2022.P12ArraysExercises;
import java.util.Arrays;
import java.util.Scanner;


public class P7AnotherSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int biggestCounter = 0;
        int keepFirstIndex = 0;
        int keepSecondIndex = 0;

        int i = 0;

        while(i < numbers.length - 1 ) {
            int j = i + 1;

            int counter = 1;
            while(j < numbers.length && numbers[j] == numbers[i]){
                counter++;
                j++;
            }
            if(counter > biggestCounter) {
                biggestCounter = counter;
                keepFirstIndex = i;
                keepSecondIndex = j;
            }
            i = j;
        }
        for ( i = keepFirstIndex; i < keepSecondIndex ; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
