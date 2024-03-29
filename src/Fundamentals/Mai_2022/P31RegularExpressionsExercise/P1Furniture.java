package Fundamentals.Mai_2022.P31RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

public class P1Furniture {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        List<String> furniture = new ArrayList<>();
        double totalSum = 0;

        Pattern pattern = Pattern.compile(">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)");

        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(furnitureName);
                double currentFurniturePrice = price * quantity;
                totalSum += currentFurniturePrice;

            }

            input = scan.nextLine();
        }

        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);

    }
}
