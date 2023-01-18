package Fundamentals.Exams.FinalExam;
import java.util.*;
public class P3AnotherSolutionWithMap {

          public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());
            Map<String, Integer> plantsRarity = new LinkedHashMap<>();
            Map<String, List<Double>> plantsRating = new LinkedHashMap<>();

            for (int i = 0; i < n; i++) {
                String[] tokens = scanner.nextLine().split("<->");
                String plant = tokens[0];
                int rarity = Integer.parseInt(tokens[1]);

                plantsRarity.putIfAbsent(plant, rarity);
                plantsRating.putIfAbsent(plant, new ArrayList<>());
            }

            String input = scanner.nextLine();
            while (!input.equals("Exhibition")) {
                String[] tokens = input.split(":\\s+");
                String command = tokens[0];
                if (command.equals("Rate")) {
                    String[] secondTokens = tokens[1].split("\\s+-[\\s+]?");
                    String plant = secondTokens[0];
                    double rating = Double.parseDouble(secondTokens[1]);

                    plantsRating.put(plant, plantsRating.get(plant));
                    plantsRating.get(plant).add(rating);
                } else if (command.equals("Update")) {
                    String[] secondTokens = tokens[1].split("\\s+-[\\s+]?");
                    String plant = secondTokens[0];
                    int newRarity = Integer.parseInt(secondTokens[1]);
                    plantsRarity.put(plant, newRarity);
                } else if (command.equals("Reset")) {
                    String plant = tokens[1];
                    plantsRating.get(plant).clear();
                } else {
                    System.out.println("error");
                }

                input = scanner.nextLine();
            }


            Map<String, double[]> resultMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : plantsRarity.entrySet()) {
                String plant = entry.getKey();
                double value = entry.getValue();

                resultMap.put(plant, new double[2]);
                resultMap.get(plant)[0] = value;
            }

            Map<String, Double> averageRatingsMap = new LinkedHashMap<>();
            double average = 0;
            for (Map.Entry<String, List<Double>> entry : plantsRating.entrySet()) {
                String plant = entry.getKey();
                List<Double> doubles = plantsRating.get(plant);
                double sum = 0;
                for (int g = 0; g < doubles.size(); g++) {
                    sum += doubles.get(g);
                }
                if (sum == 0) {
                    average = 0.0;
                } else {
                    average = sum / doubles.size();
                }
                averageRatingsMap.putIfAbsent(plant, average);
            }

            for (Map.Entry<String, Double> entry : averageRatingsMap.entrySet()) {
                String plant = entry.getKey();
                double rating = entry.getValue();

                resultMap.put(plant, resultMap.get(plant));
                resultMap.get(plant)[1] = rating;
            }

            System.out.println("Plants for the exhibition:");
            resultMap.entrySet()
                    .stream()
                    .sorted((left, right) -> {
                        if (right.getValue()[0] == left.getValue()[0]) {
                            return Double.compare(right.getValue()[1], left.getValue()[1]);
                        }
                        return Double.compare(right.getValue()[0], left.getValue()[0]);
                    })
                    .forEach(plant -> System.out.println(String.format("- %s; Rarity: %d; Rating: %.2f",
                            plant.getKey(), (int) plant.getValue()[0], plant.getValue()[1])));
        }
    }
