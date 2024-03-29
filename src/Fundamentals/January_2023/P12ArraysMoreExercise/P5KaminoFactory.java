package Fundamentals.January_2023.P12ArraysMoreExercise;

import java.util.Scanner;

public class P5KaminoFactory {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        String input = "";
        int bestSequenceIndex = Integer.MAX_VALUE;
        int bestSequenceSum = 0;
        int bestIndexInARow = 0;
        int bestIndexInARowOutput = 0;
        String sequenceOutput = "";

        while(!"Clone them!".equals(input = scan.nextLine())){
            ++bestIndexInARow;

            String[] dna = input.split("!+");

            int[] sequenceDNA = new int[num];

            for (int i = 0; i < dna.length; i++) {
             sequenceDNA[i] = Integer.parseInt(dna[i]);
            }

            int maxCount = 0;
            int sequenceIndex = 0;

            for (int i = 0; i < sequenceDNA.length; i++) {
                int currentCount = 0;
                for (int j = i; j < sequenceDNA.length; j++) {
                    if(sequenceDNA[i] == sequenceDNA[j]){
                        currentCount++;
                        if(currentCount > maxCount){
                            maxCount = currentCount;
                            sequenceIndex = i;
                        }

                    }else{
                        break;
                    }
                }

            }
            int sequenceSum = 0;

            for (int i = 0; i < sequenceDNA.length; i++) {
                if(sequenceDNA[i] == 1){
                    sequenceSum += sequenceDNA[i];
                }

            }
            if(sequenceIndex < bestSequenceIndex || sequenceSum > bestSequenceSum){
                sequenceOutput = "";
                bestSequenceIndex = sequenceIndex;
                bestSequenceSum = sequenceSum;
                bestIndexInARowOutput = bestIndexInARow;

                for (int i = 0; i < sequenceDNA.length; i++) {
                    sequenceOutput += sequenceDNA[i] + " ";

                }
            }
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.", bestIndexInARowOutput, bestSequenceSum));
        System.out.println(sequenceOutput.trim());

    }
}
