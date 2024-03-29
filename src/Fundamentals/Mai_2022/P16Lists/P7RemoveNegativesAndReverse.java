package Fundamentals.Mai_2022.P16Lists;

import java.util.*;
import java.text.DecimalFormat;
import java.util.stream.Collectors;

public class P7RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        numList.removeIf(e -> e < 0);



        if(numList.isEmpty()){
            System.out.println("empty");
        }else {
            Collections.reverse(numList);
            System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
