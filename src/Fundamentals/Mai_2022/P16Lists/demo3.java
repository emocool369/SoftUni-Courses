package Fundamentals.Mai_2022.P16Lists;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;



public class demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputList = scan.nextLine();

        List<String> items = Arrays.stream(inputList.split(" ")).collect(Collectors.toList());
        //List<String> items = Arrays.stream(inputList.split(" ")).toList());

        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            numbersList.add(Integer.parseInt(items.get(i)));
        }

        List<Integer> newList = Arrays.stream(scan.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());

        System.out.println();

    }
}
