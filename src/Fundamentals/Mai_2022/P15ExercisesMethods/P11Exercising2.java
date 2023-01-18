package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class P11Exercising2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split("\\s+");
        String command = scan.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");

            if (tokens[0].equals("exchange")) {
                array = exchange(array, tokens[1]);
            } else if (tokens[0].equals("max")) {
                if (tokens[1].equals("even")) {
                    maxEven(array);
                } else {
                    maxOdd(array);
                }
            } else if (tokens[0].equals("min")) {
                if (tokens[1].equals("even")) {
                    minEven(array);
                } else {
                    minOdd(array);
                }

            }else if (tokens[0].equals("first")){
                if(tokens[2].equals("even")){
                    firstEven(array, tokens[1]);
                }else{
                    firstOdd(array, tokens[1]);
                }
            } else if (tokens[0].equals("last")) {
                if(tokens[2].equals("even")){
                    lastEven(array, tokens[1]);
                }else{
                    lastOdd(array, tokens[1]);
                }

            }
            command = scan.nextLine();
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i] + ", ");
            }

        }
        System.out.println("]");
    }

    //METHOD EXCHANGE

    public static String[] exchange(String[] array, String token) {
        int index = Integer.parseInt(token);

        String[] newArray = new String[array.length];

        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index");
            return array;

        } else {

            int x = 0;
            for (int newStart = index + 1; newStart < array.length; newStart++) {
                newArray[x] = array[newStart];
                x++;
            }
            for (int newEnd = 0; newEnd <= index; newEnd++) {
                newArray[x] = array[newEnd];
                x++;
            }

        }
        return newArray;


    }

    //METHODS MAX

    //EVEN

    private static void maxEven(String[] array) {
        int maxElement = Integer.MIN_VALUE;
        int indexOfMaxElement = -1;

        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) % 2 == 0) {
                if (Integer.parseInt(array[i]) >= maxElement) {
                    maxElement = Integer.parseInt(array[i]);
                    indexOfMaxElement = i;
                }
            }

        }

        if (indexOfMaxElement > -1) {
            System.out.println(indexOfMaxElement);
        } else {
            System.out.println("No matches");
        }

    }

    //ODD

    private static void maxOdd(String[] array) {
        int maxElement = Integer.MIN_VALUE;
        int indexOfMaxElement = -1;

        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) % 2 != 0) {
                if (Integer.parseInt(array[i]) >= maxElement) {
                    maxElement = Integer.parseInt(array[i]);
                    indexOfMaxElement = i;
                }
            }

        }

        if (indexOfMaxElement > -1) {
            System.out.println(indexOfMaxElement);
        } else {
            System.out.println("No matches");
        }

    }

    //METHODS MIN

    //EVEN

    private static void minEven(String[] array) {
        int minElement = Integer.MAX_VALUE;
        int indexOfMinElement = -1;

        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) % 2 == 0) {
                if (Integer.parseInt(array[i]) <= minElement) {
                    minElement = Integer.parseInt(array[i]);
                    indexOfMinElement = i;
                }
            }

        }

        if (indexOfMinElement > -1) {
            System.out.println(indexOfMinElement);
        } else {
            System.out.println("No matches");
        }

    }

    //ODD

    private static void minOdd(String[] array) {
        int minElement = Integer.MAX_VALUE;
        int indexOfMinElement = -1;

        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) % 2 != 0) {
                if (Integer.parseInt(array[i]) <= minElement) {
                    minElement = Integer.parseInt(array[i]);
                    indexOfMinElement = i;
                }
            }

        }

        if (indexOfMinElement > -1) {
            System.out.println(indexOfMinElement);
        } else {
            System.out.println("No matches");
        }

    }

    //METHODS FIRST

    //EVEN

    private static void firstEven(String[] array, String token) {
        int neededCount = Integer.parseInt(token);

        if (neededCount > array.length) {
            System.out.println("Invalid count");
        } else {
            int countEven = 0;
            for (int i = 0; i < array.length; i++) { //броя колко четни числа има в масива
                if (Integer.parseInt(array[i]) % 2 == 0) {
                    countEven++;
                }
            }

            int[] newArray = new int[Math.min(countEven, neededCount)]; //създавам нов масив
            if (newArray.length > 0) {
                int index = 0;
                for (int i = 0; i < newArray.length; i++) {
                    if (Integer.parseInt(array[i]) % 2 == 0) {
                        newArray[index] = Integer.parseInt(array[i]); //попълвам масива с четни числа
                        index++;
                        if (index > array.length - 1) { //ако индекса стане по-голям от броя на числата в масива, прекъсвам цикъла
                            break;
                        }
                    }
                }

                System.out.print("[");
                for (int i = 0; i < newArray.length; i++) {
                    if (i == newArray.length - 1) {
                        System.out.print(newArray[i]); //печатам последния елемент в масива
                    } else {
                        System.out.print(newArray[i] + ", "); //печатам всички елементи в масива преди последния елемент
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("[]");
            }
        }
    }

    //ODD


    private static void firstOdd(String[] array, String token) {
        int neededCount = Integer.parseInt(token);

        if (neededCount > array.length) {
            System.out.println("Invalid count");
        } else {
            int countOdd = 0;
            for (int i = 0; i < array.length; i++) { //броя колко четни числа има в масива
                if (Integer.parseInt(array[i]) % 2 != 0) {
                    countOdd++;
                }
            }

            int[] newArray = new int[Math.min(countOdd, neededCount)]; //създавам нов масив
            if (newArray.length > 0) {
                int index = 0;
                for (int i = 0; i < newArray.length; i++) {
                    if (Integer.parseInt(array[i]) % 2 != 0) {
                        newArray[index] = Integer.parseInt(array[i]); //попълвам масива с четни числа
                        index++;
                        if (index > array.length - 1) { //ако индекса стане по-голям от броя на числата в масива, прекъсвам цикъла
                            break;
                        }
                    }
                }

                System.out.print("[");
                for (int i = 0; i < newArray.length; i++) {
                    if (i == newArray.length - 1) {
                        System.out.print(newArray[i]);
                    } else {
                        System.out.print(newArray[i] + ", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("[]");
            }
        }
    }

    //METHODS LAST

    //EVEN

    private static void lastEven(String[] array, String token) {
        int neededCount = Integer.parseInt(token);

        if (neededCount > array.length) {
            System.out.println("Invalid count");
        } else {
            int countEven = 0;
            for (int i = 0; i < array.length; i++) { //броя колко четни числа има в масива
                if (Integer.parseInt(array[i]) % 2 == 0) {
                    countEven++;
                }
            }

            int[] newArray = new int[Math.min(countEven, neededCount)]; //създавам нов масив
            if (newArray.length > 0) {
                int index = 0;
                for (int i = array.length - 1; i >= 0; i--) {
                    if (Integer.parseInt(array[i]) % 2 == 0) {
                        newArray[index] = Integer.parseInt(array[i]); //попълвам масива с четни числа
                        index++;
                        if (index > array.length - 1) { //ако индекса стане по-голям от броя на числата в масива, прекъсвам цикъла
                            break;
                        }
                    }
                }
                int[] reversedArray = new int[newArray.length];
                for (int i = 0; i < reversedArray.length ; i++) {
                    reversedArray[i] = newArray[newArray.length - (i + 1)];

                }

                System.out.print("[");
                for (int i = 0; i < reversedArray.length; i++) {
                    if (i == reversedArray.length - 1) {
                        System.out.print(reversedArray[i]);
                    } else {
                        System.out.print(reversedArray[i] + ", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("[]");
            }
        }
    }

    //ODD

    private static void lastOdd(String[] array, String token) {
        int neededCount = Integer.parseInt(token);

        if (neededCount > array.length) {
            System.out.println("Invalid count");
        } else {
            int countOdd = 0;
            for (int i = 0; i < array.length; i++) { //броя колко четни числа има в масива
                if (Integer.parseInt(array[i]) % 2 != 0) {
                    countOdd++;
                }
            }

            int[] newArray = new int[Math.min(countOdd, neededCount)]; //създавам нов масив
            if (newArray.length > 0) {
                int index = 0;
                for (int i = array.length - 1; i >= 0; i--) {
                    if (Integer.parseInt(array[i]) % 2 != 0) {
                        newArray[index] = Integer.parseInt(array[i]); //попълвам масива с четни числа
                        index++;
                        if (index > array.length - 1) { //ако индекса стане по-голям от броя на числата в масива, прекъсвам цикъла
                            break;
                        }
                    }
                }
                int[] reversedArray = new int[newArray.length];
                for (int i = 0; i < reversedArray.length ; i++) {
                    reversedArray[i] = newArray[newArray.length - (i + 1)];

                }

                System.out.print("[");
                for (int i = 0; i < reversedArray.length; i++) {
                    if (i == reversedArray.length - 1) {
                        System.out.print(reversedArray[i]);
                    } else {
                        System.out.print(reversedArray[i] + ", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("[]");
            }
        }
    }

}




