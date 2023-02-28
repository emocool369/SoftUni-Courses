package Fundamentals.Exams.FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2DestinationMapper2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<String> travelDestinations = new ArrayList<>();

        Pattern pattern = Pattern.compile("(?<symbols>[=/])(?<destinations>[A-Z][a-zA-Z]{2,})(\\k<symbols>)");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            travelDestinations.add(matcher.group("destinations"));

        }

        int sum = 0;

        for (String destination : travelDestinations){
            int length = destination.length();
            sum += length;
        }

        System.out.println("Destinations: " + String.join(", ", travelDestinations));
        System.out.println("Travel Points: " + sum);
    }
}
