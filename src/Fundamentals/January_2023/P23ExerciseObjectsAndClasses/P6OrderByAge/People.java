package Fundamentals.January_2023.P23ExerciseObjectsAndClasses.P6OrderByAge;

public class People {
    private String name;
    private String id;
    private int age;

    public People(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
        //setters
        public void setName (String name){
            this.name = name;
        }
        public void setId (String id){
            this.id = id;
        }
        public void setAge (int age){
            this.age = age;
        }

        //getters
        public String getName(){
            return this.name;
        }
        public String getId(){
            return this.id;
        }
        public int getAge(){
            return this.age;
        }

        @Override
    public String toString(){
        return String.format("%s with ID: %s is %d years old.",this.name, this.id, this.age);
        }
    }

