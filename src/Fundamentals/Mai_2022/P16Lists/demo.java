package Fundamentals.Mai_2022.P16Lists;
import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();

        namesList.add("Peter");
        namesList.add("Maria");
        namesList.add("George");
        namesList.remove("Maria");

        for(String name : namesList)

            System.out.println(name);
    }
}
