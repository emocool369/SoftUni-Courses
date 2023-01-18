package Fundamentals.Exams.FinalExamRetake;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P2MirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Pattern hiddenWordPattern = Pattern.compile("(@|#)(?<word>[A-Za-z]{3,})\\1\\1(?<mirror>[A-Za-z]{3,})\\1");
        Matcher matcher = hiddenWordPattern.matcher(input);

        int numberFoundedPairs = 0;
        List<List<String>> mirrorPairs = new ArrayList<>();

        while (matcher.find()) {
            numberFoundedPairs++;
            String firstWord = matcher.group("word");
            String secondWord = new StringBuilder(matcher.group("mirror")).reverse().toString();

            if (firstWord.equals(secondWord)) {
                mirrorPairs.add(List.of(firstWord, matcher.group("mirror")));
            }
        }
        if (numberFoundedPairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", numberFoundedPairs);
        }

       /* String[] parts = mirrorPairs.toString().split("[#@]"); създавам нов масив като деля по @ или №
        String partsString = Arrays.toString(parts); масива го правя на стринг
        partsString = partsString.replaceAll("[\\[\\],]", ""); в масива заменям всички [ ] , с празно място
        String[] partArray = partsString.split("\\s+"); създавам нов масив като трия празните места
        partArray = Arrays.copyOfRange(partArray, 1, partArray.length); в новия масив на първия индекс е празно място, изтривам го
        List<String> finalList = new ArrayList<>(Arrays.asList(partArray)); създавам нов списък и наливам масива вътре
*/
        if (mirrorPairs.isEmpty()) {
            System.out.println("No mirror words!");

        } else {
            System.out.println("The mirror words are:");
            System.out.println(mirrorPairs.stream()
                    .map(pair -> String.join(" <=> ", pair))
                    .collect(Collectors.joining(", ")));
        }
    }
}
