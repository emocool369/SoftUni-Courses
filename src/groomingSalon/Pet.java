package groomingSalon;

public class Pet {
    private String name;
    private int age;
    private String owner;


    public Pet (String nameObj, int ageObj, String ownerObj) {
        this.name = nameObj;
        this.age = ageObj;
        this.owner = ownerObj;
    }

    //setters
    public void setName(String nameObj) {
        this.name = nameObj;
    }

    public void setAge(int ageObj) {
        this.age = ageObj;
    }

    public void setOwner(String ownerObj) {
        this.owner = ownerObj;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getOwner() {
        return this.owner;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " - (" + this.owner + ")";
        // return String.format("%s %d - (%s)", this.name, this.age, this.owner);
    }
}
