package Basics.L13NestedLoops;
import java.util.Scanner;
public class P05Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputLine = scan.nextLine();
        while (!inputLine.equals("End")){
            String destination = inputLine;
            double priceTrip = Double.parseDouble(scan.nextLine());

            double sum =0; //сумата за всички текущи пари за текущата итерация/дестинация, напр Гърция

            while (sum < priceTrip){
                double amount = Double.parseDouble(scan.nextLine());
                sum = sum + amount;
            }
            System.out.printf("Going to %s!%n", destination);
            inputLine = scan.nextLine();
        }

    }
}
