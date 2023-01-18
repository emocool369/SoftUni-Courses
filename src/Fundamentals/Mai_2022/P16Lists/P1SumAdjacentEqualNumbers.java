package Fundamentals.Mai_2022.P16Lists;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.stream.Collectors;

public class P1SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       List<Double> numbersList = new java.util.ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble).toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {

            double firsEl = numbersList.get(i);
            double secondEl =numbersList.get(i+1);

            if(firsEl == secondEl){
                numbersList.set(i, numbersList.get(i) + numbersList.get(i+1));
                numbersList.remove(i + 1);

                i = -1;
            }

        }
        System.out.println(joinElByDelimiter(numbersList, " "));
    }
    public static String joinElByDelimiter(List<Double> list, String delimiter){
        String result = " ";
        for (Double num : list){
            DecimalFormat df = new DecimalFormat("0.#");

            String numFormat = df.format(num) + delimiter;

            result += numFormat;
        }
        return result;
    }
}
