package Fundamentals.January_2023.P23ExerciseObjectsAndClasses.P6OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        List<People> peopleList = new ArrayList<>();

        String input = "";

        while(!"End".equals(input = scan.nextLine())){
            String[] inputData = input.split(" ");
            String name = inputData[0];
            String ID = inputData[1];
            int age = Integer.parseInt(inputData[2]);

            People newPeople = new People(name, ID, age);

            peopleList.add(newPeople);

        }

        peopleList.sort(Comparator.comparing(People::getAge));
        for(People people : peopleList){
            System.out.println(people.toString());
        }

       // for (Person person : peopleList) {
            //"Stephan with ID: 524244 is 10 years old."
          //  System.out.println(person.getName() + " with ID: " + person.getId() + " is " + person.getAge() + " years old.");
      //  }
    }

}
