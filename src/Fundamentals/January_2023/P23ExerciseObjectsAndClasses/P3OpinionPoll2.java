package Fundamentals.January_2023.P23ExerciseObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P3OpinionPoll2 {

    static class Person1{
        String name;
        int age;
/*
        public Person(String nameObj, int ageObj){
            this.name = nameObj;
            this.age = ageObj;
        }
*/
        //Setters
        public void setName (String nameObj){
            this.name = nameObj;
        }
        public void setAge (int ageObj){
            this.age = ageObj;
        }

        //Getters
        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        List<Person1> listWithPersons = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            String personsInfo = scan.nextLine();
            String[] personsSplit = personsInfo.split(" " );

            Person1 newPerson = new Person1();

            newPerson.setName(personsSplit[0]);
            newPerson.setAge(Integer.parseInt(personsSplit[1]));

            listWithPersons.add(newPerson);


        }

        for (Person1 checkPerson : listWithPersons){
            if (checkPerson.getAge() > 30){
                System.out.printf("%s - %d%n", checkPerson.getName(), checkPerson.getAge());
            }
        }

    }
}
