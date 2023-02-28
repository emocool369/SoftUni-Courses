package Fundamentals.January_2023.P23ExerciseObjectsAndClasses.P3OpinionPoll;

public class Person {
    private String name;
    private int age;

    public Person(String nameObj, int ageObj) {
        this.name = nameObj;
        this.age = ageObj;
    }

    // Setters
    public void setName(String nameObj) {
        this.name = nameObj;
    }

    public void setAge(int ageObj) {
        this.age = ageObj;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}