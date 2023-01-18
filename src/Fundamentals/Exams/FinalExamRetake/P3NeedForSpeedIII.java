package Fundamentals.Exams.FinalExamRetake;

import java.util.*;

public class P3NeedForSpeedIII {

    static class Cars {
        public String carModel;
        public int mileage;
        public int fuel;

        //getters
        public String getCarModel() {
            return this.carModel;
        }

        public Integer getMileage() {
            return this.mileage;
        }

        public Integer getFuel() {
            return this.fuel;
        }

        //setters
        public void setCarModel(String carModel) {
            this.carModel = carModel;
        }

        public void setMileage(Integer mileage) {
            this.mileage = mileage;
        }

        public void setFuel(Integer fuel) {
            this.fuel = fuel;
        }

        //constructor
        public Cars(String carModel, int mileage, int fuel) {
            this.carModel = carModel;
            this.mileage = mileage;
            this.fuel = fuel;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scan.nextLine());
        int resultMileage = 0;
        int resultFuel = 0;
        List<Cars> cars = new ArrayList<>();

        for (int i = 1; i <= numberOfCars; i++) {
            String[] carModel = scan.nextLine().split("\\|");
            String model = carModel[0];
            int mileage = Integer.parseInt(carModel[1]);
            int fuel = Integer.parseInt(carModel[2]);

            Cars currentCar = new Cars(model, mileage, fuel);
            /*
            currentCar.setCarModel(carModel[0]);
            currentCar.setMileage(mileage);
            currentCar.setFuel(fuel);*/

            cars.add(currentCar);

        }

        String commands = scan.nextLine();

        while (!commands.equals("Stop")) {
            String[] commandParts = commands.split("\\s*:\\s*");
            String commandName = commandParts[0];
            String carModel = commandParts[1];
            int distanceFuelKilometers = Integer.parseInt(commandParts[2]);

            switch (commandName) {
                case "Drive":
                    int fuel = Integer.parseInt(commandParts[3]);

                    for (Cars carName : cars) {
                        if (carName.getCarModel().equals(carModel)) {
                            if (fuel > carName.getFuel()) {
                                System.out.println("Not enough fuel to make that ride");
                            } else {
                                resultFuel = carName.getFuel() - fuel;
                                carName.setFuel(resultFuel);

                                if (resultFuel < 0) {
                                    System.out.println("Not enough fuel to make that ride");
                                    break;
                                }

                                resultMileage = carName.getMileage() + distanceFuelKilometers;
                                carName.setMileage(resultMileage);

                                System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carName.getCarModel(), distanceFuelKilometers, fuel);

                                if (carName.getMileage() >= 100000) {
                                    cars.remove(carName);
                                    System.out.printf("Time to sell the %s!%n", carName.getCarModel());
                                }

                                break;
                            }


                        }
                    }

                    break;


                case "Refuel":

                    for (Cars carName : cars) {
                        if (carName.getCarModel().equals(carModel)) {

                            if (carName.getFuel() == 75) {
                                System.out.printf("%s refueled with 0 liters%n", carName.getCarModel());
                                break;
                            } else {
                                resultFuel = carName.getFuel() + distanceFuelKilometers;
                                if (resultFuel <= 75) {
                                    carName.setFuel(resultFuel);
                                    System.out.printf("%s refueled with %d liters%n", carName.getCarModel(), distanceFuelKilometers);
                                    break;
                                } else {
                                    int extraFuel = resultFuel - 75;
                                    int filledFuel = distanceFuelKilometers - extraFuel;
                                    carName.setFuel(75);
                                    System.out.printf("%s refueled with %d liters%n", carName.getCarModel(), filledFuel);
                                    break;
                                }


                            }
                        }
                    }


                    break;
                case "Revert":

                    for (Cars carName : cars) {
                        if (carName.getCarModel().equals(carModel)) {
                            resultMileage = carName.getMileage() - distanceFuelKilometers;

                            if (resultMileage < 10000) {
                                carName.setMileage(10000);
                                break;
                            } else {
                                carName.setMileage(resultMileage);
                                System.out.printf("%s mileage decreased by %d kilometers%n", carName.getCarModel(), distanceFuelKilometers);
                                break;
                            }

                        }
                    }

                    break;
            }


            commands = scan.nextLine();
        }

        for (
                Cars carName : cars) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", carName.getCarModel(), carName.getMileage(), carName.getFuel());
        }
    }
}
