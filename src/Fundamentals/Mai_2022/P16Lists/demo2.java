package Fundamentals.Mai_2022.P16Lists;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class demo2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int currentNum = Integer.parseInt(scan.nextLine());

            numbersList.add(currentNum);
        }

        for (int number : numbersList){
            System.out.print(number + " ");

        }

    }
}
