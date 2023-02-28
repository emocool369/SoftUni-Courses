package Fundamentals.January_2023.P23ExerciseObjectsAndClasses.P5VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
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



        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageHPCar(vehicleList, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.%n", getAverageHPCar(vehicleList, "trucks"));
    }

    private static double getAverageHPCar(List<Vehicle> vehicleList, String type) {
        double sum = 0;
        int count = 0;

        if(type.equals("cars")){
            for(Vehicle vehicle : vehicleList){
                if(vehicle.getTypeOfVehicle().equals("car")){
                    sum += vehicle.getHorsePower();
                    count++;
                }
            }
        }else if (type.equals("trucks")){
            for(Vehicle vehicle : vehicleList){
                if(vehicle.getTypeOfVehicle().equals("truck")){
                    sum += vehicle.getHorsePower();
                    count++;
                }
            }
            if(sum == 0){
                return 0;
            }
        }
        return sum / count;
    }

    public static void printVehicle(String type, String model, String color, int horsePower) {
        System.out.println("Type: " + type);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Horsepower: " + horsePower);
    }

}
