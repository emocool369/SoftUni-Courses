package Fundamentals.Exams.FinalExamRetake2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2AdAstraBadRegEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        Pattern food = Pattern.compile("([#|])([A-Za-z\\s]+)\\1(\\d{2}/\\d{2}/\\d{2})\\1(\\d{1,5})\\1");
        Matcher matcher = food.matcher(text);

        int sumCalories = 0;

        List<String[]> foods = new ArrayList<>();
        List<Integer> nutrition = new ArrayList<>();

        while(matcher.find()){
            String nameOfFood = matcher.group(1);
            String expirationDate = matcher.group(2);
            String[] foodInfo = {nameOfFood, expirationDate};
            foods.add(foodInfo);
            int calories = Integer.parseInt(matcher.group(3));
            nutrition.add(calories);
            sumCalories += calories;
        }

        int days = sumCalories / 2000;

        System.out.printf("You have food to last you for: %d days!%n", days);

        for (int i = 0; i < foods.size(); i++) {
            String[] foodInfo = foods.get(i);
            String itemName = foodInfo[0];
            String expirationDate = foodInfo[1];
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", itemName, expirationDate, nutrition.get(i));

        }

    }
}
