package Fundamentals.January_2023.P20MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class P3AnotherSolution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> integers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).sorted(Collections.reverseOrder()).collect(Collectors.toList());

        int sum = 0;
        double averageValue = 0.0;

        for (Integer currentInt : integers) {
            sum += currentInt;
        }
        averageValue = sum * 1.0 / integers.size();

        List<Integer> greaterNumbers = new ArrayList<>();
        for (int number : integers) {
            if (number > averageValue) {
                greaterNumbers.add(number);
                {
                }
            }
        }
        if (greaterNumbers.isEmpty()) {
            System.out.println("No");
        } else if (greaterNumbers.size() < 5) {
            for (Integer number : greaterNumbers) {
                System.out.printf("%d ", number);
            }
        } else {
            for (int i = 0; i <= 4; i++) {
                System.out.print(greaterNumbers.get(i) + " ");

            }
        }
    }
}
