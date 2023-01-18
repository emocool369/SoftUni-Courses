import java.util.*;

public class lotto6x49 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        Random rnd = new Random();

        int powerBall = rnd.nextInt(9);

        for (int i = 0; i < 6; i++) {
            int number6x49 = rnd.nextInt(49);

            if(!numbers.contains(number6x49) && number6x49 !=0){
                numbers.add(number6x49);
            }


        }
        Collections.sort(numbers);
        System.out.print(numbers + " ");
        System.out.println(powerBall);
    }
}
