package Fundamentals.January_2023.P20MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class P3Numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> integers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> topIntegers = new ArrayList<>();

        double averageValue = 0.0;
        int sum = 0;

        for (int number : integers) {
            sum += number;
        }

        averageValue = sum * 1.0 / integers.size();

        for (int number : integers) {
            if (number > averageValue) {
                topIntegers.add(number);
            }
        }

        Collections.sort(topIntegers);
        Collections.reverse(topIntegers);

        if (topIntegers.size() < 5 && topIntegers.size() >= 1) {
            for (int i = 0; i < topIntegers.size(); i++) {
                System.out.print(topIntegers.get(i) + " ");
            }
        } else if (topIntegers.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(topIntegers.get(i) + " ");
            }
        } else {
            System.out.println("No");
        }
    }
}

