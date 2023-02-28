package Fundamentals.January_2023.P23ExerciseObjectsAndClasses.P5VehicleCatalogue;

public class Vehicle {
    private String typeOfVehicle;
    private String modelOfVehicle;
    private String colorOfVehicle;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower){
        this.typeOfVehicle = type;
        this.modelOfVehicle = model;
        this.colorOfVehicle = color;
        this.horsePower = horsePower;
    }

    //setters
    public void setTypeOfVehicle(String type){
        this.typeOfVehicle = type;
    }
    public void setModelOfVehicle(String model){
        this.modelOfVehicle = model;
    }
    public void setColorOfVehicle(String color){
        this.colorOfVehicle = color;
    }
    public void setHorsePower(int hp){
        this.horsePower = hp;
    }

    //getters
    public String getTypeOfVehicle(){
        return this.typeOfVehicle;
    }
    public String getModelOfVehicle(){
        return this.modelOfVehicle;
    }
    public String getColorOfVehicle(){
        return this.colorOfVehicle;
    }
    public int getHorsePower(){
        return this.horsePower;
    }


}
