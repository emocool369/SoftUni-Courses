package Fundamentals.Exams.FinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

public class P2DestinationMapper {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String destinations = scan.nextLine();
        List<String> finalDestinations = new ArrayList<>();

        Pattern pattern = Pattern.compile("=[A-Z][A-Za-z]{2,}=|/[A-Z][A-Za-z]{2,}/");
        //([=/])([A-Z][A-Za-z]{2,})\1
        Matcher matcher = pattern.matcher(destinations);

        while (matcher.find()) {

            finalDestinations.add(matcher.group());
        }

        int numberOfDestinations = finalDestinations.size();
        int totalLenght = 0;

        for (String travelPoints : finalDestinations) {
            totalLenght += travelPoints.length();
        }

        int travelPoints = totalLenght - numberOfDestinations * 2;


        System.out.println("Destinations: " + finalDestinations.toString().replaceAll("[\\[\\]=/]", ""));
        System.out.printf("Travel Points: %d", travelPoints);
    }
}
