package Fundamentals.January_2023.P23ExerciseObjectsAndClasses.P5VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();


        String vehicleData = "";
        while (!"End".equals(vehicleData = scan.nextLine())) {
            String type = vehicleData.split("\\s")[0];
            String model = vehicleData.split("\\s")[1];
            String color = vehicleData.split("\\s")[2];
            int horsePower = Integer.parseInt(vehicleData.split("\\s")[3]);

            Vehicle newVehicle = new Vehicle(type, model, color, horsePower);

            vehicleList.add(newVehicle);

        }

        String models = "";
        while (!"Close the Catalogue".equals(models = scan.nextLine())) {

            for (Vehicle currentVehicle : vehicleList) {
                if (currentVehicle.getModelOfVehicle().equals(models)) {
                    String type = currentVehicle.getTypeOfVehicle();
                    String typeWithCapitalFirstLetter = type.substring(0,1).toUpperCase() + type.substring(1);
                    printVehicle(typeWithCapitalFirstLetter, currentVehicle.getModelOfVehicle(), currentVehicle.getColorOfVehicle(), currentVehicle.getHorsePower());
                    break;
                }
            }
        }

        int sumCars = 0;
        int sumTrucks = 0;
        int numCars = 0;
        int numTrucks = 0;
        for (Vehicle currentVehicle : vehicleList) {
            if (currentVehicle.getTypeOfVehicle().equals("car")) {
                sumCars += currentVehicle.getHorsePower();
                numCars++;
            } else {
                sumTrucks += currentVehicle.getHorsePower();
                numTrucks++;
            }
        }

        double averageHPCar = sumCars * 1.0 / numCars;
        double averageHPTruck = sumTrucks * 1.0 / numTrucks;

        if (numCars == 0) {
            averageHPCar = 0.0;

        } else if (numTrucks == 0) {
            averageHPTruck = 0.0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHPCar);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageHPTruck);
    }

    public static void printVehicle(String type, String model, String color, int horsePower) {
        System.out.println("Type: " + type);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Horsepower: " + horsePower);
    }

}
