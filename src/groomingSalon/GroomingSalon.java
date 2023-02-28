package groomingSalon;


import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    List<Pet> data;

    private int capacity;

    public GroomingSalon(int capacityObj) {
        this.capacity = capacityObj;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (data.size() < capacity) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet pet : data) {
            if (pet.getName().equals(name)) {
                this.data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet (String name, String owner){
        for (Pet pet : data){
            if(pet.getName().equals(name) && pet.getOwner().equals(owner)){
                return pet;
            }
        }
        return null;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        String output = "";
        output +="The grooming salon has the following clients:\n";
        for(Pet pet : data){
            output += pet.getName() + " " + pet.getOwner() + "\n";
        }
        return output;
    }
}



