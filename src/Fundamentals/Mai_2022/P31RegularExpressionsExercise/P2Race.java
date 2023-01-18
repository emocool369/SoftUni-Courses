package Fundamentals.Mai_2022.P31RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

public class P2Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String names = scan.nextLine();

        List<String> racersNames = Arrays.stream(names.split(", ")).collect(Collectors.toList());
        Map<String, Integer> racersDistances = new HashMap<>();
        racersNames.forEach(name -> racersDistances.put(name, 0));

        String regexLetters = "[A-Za-z]+";
        Pattern patternLetter = Pattern.compile(regexLetters);

        String regexDigit = "[0-9]";
        Pattern patternDigit = Pattern.compile(regexDigit);

        String input = scan.nextLine();

        while (!input.equals("end of race")) {

            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherLetter = patternLetter.matcher(input);
            while(matcherLetter.find()){
                nameBuilder.append(matcherLetter.group());
            }


            int distance = 0;
            Matcher matcherDigit = patternDigit.matcher(input);
            while(matcherDigit.find()){
                distance += Integer.parseInt(matcherDigit.group());
            }

            String racerName = nameBuilder.toString();
            if(racersDistances.containsKey(racerName)){
                int currentDistance = racersDistances.get(racerName);
                racersDistances.put(racerName, currentDistance + distance);
            }


                    input = scan.nextLine();
        }

        List<String> nameOfFirstThree = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.println("1st place: " + nameOfFirstThree.get(0));
        System.out.println("2nd place: " + nameOfFirstThree.get(1));
        System.out.println("3rd place: " + nameOfFirstThree.get(2));
    }
}
