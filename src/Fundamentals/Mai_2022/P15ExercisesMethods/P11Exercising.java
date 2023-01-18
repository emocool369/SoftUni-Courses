package Fundamentals.Mai_2022.P15ExercisesMethods;

import java.util.Arrays;
import java.util.Scanner;

public class P11Exercising {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputAsArray = scan.nextLine().split("\\s+");
        String command = scan.nextLine();

        while (!"end".equals(command)) {
            String[] tokens = command.split("\\s+");

            if (tokens[0].equals("exchange")) {
                inputAsArray = exchange(inputAsArray, tokens[1]);
            } else if (tokens[0].equals("max")) {
                if (tokens[1].equals("even")) {
                    maxEven(inputAsArray);
                } else {
                    maxOdd(inputAsArray);
                }
            } else if (tokens[0].equals("min")) {
                if (tokens[1].equals("even")) {
                    minEven(inputAsArray);
                } else {
                    minOdd(inputAsArray);
                }
            } else if (tokens[0].equals("first")) {
                if (tokens[2].equals("even")) {
                    firstEven(inputAsArray, tokens[1]);
                } else {
                    firstOdd(inputAsArray, tokens[1]);
                }
            } else if (tokens[0].equals("last")) {
                if (tokens[2].equals("even")) {
                    lastEven(inputAsArray, tokens[1]);
                } else {
                    lastOdd(inputAsArray, tokens[1]);
                }

            }
            command = scan.nextLine();

        }
        System.out.print("[");
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (i == inputAsArray.length - 1) {
                System.out.print(inputAsArray[i]);
            } else {
                System.out.print(inputAsArray[i] + ", ");
            }
        }
        System.out.println("]");
    }

    //METHODS
    //METHOD EXCHANGE
    private static String[] exchange(String[] inputAsArray, String token) {
        int index = Integer.parseInt(token);
        String[] newArray = new String[inputAsArray.length];
        if (index < 0 || index >= inputAsArray.length) {
            System.out.println("Invalid index");
            return inputAsArray;
        } else {
            int x = 0;
            for (int newStart = index + 1; newStart < inputAsArray.length; newStart++) {
                newArray[x] = inputAsArray[newStart];
                x++;
            }
            for (int newEnd = 0; newEnd <= index; newEnd++) {
                newArray[x] = inputAsArray[newEnd];
                x++;

            }
        }
        return newArray;

    }

    //METHODS MAX
    private static void maxEven(String[] inputAsArray) {
        int maxElement = Integer.MIN_VALUE;
        int indexOfMaxElement = -1;
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                if (Integer.parseInt(inputAsArray[i]) >= maxElement) {
                    maxElement = Integer.parseInt(inputAsArray[i]);
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


    private static void maxOdd(String[] inputAsArray) {
        int maxElement = Integer.MIN_VALUE;
        int indexOfMaxElement = -1;
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                if (Integer.parseInt(inputAsArray[i]) >= maxElement) {
                    maxElement = Integer.parseInt(inputAsArray[i]);
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

    private static void minEven(String[] inputAsArray) {
        int minElement = Integer.MAX_VALUE;
        int indexOfMinElement = -1;
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                if (Integer.parseInt(inputAsArray[i]) <= minElement){
                    minElement = Integer.parseInt(inputAsArray[i]);
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


    private static void minOdd(String[] inputAsArray) {
        int minElement = Integer.MAX_VALUE;
        int indexOfMinElement = -1;
        for (int i = 0; i < inputAsArray.length - 1; i++) {
            if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                if (Integer.parseInt(inputAsArray[i]) <= minElement){
                    minElement = Integer.parseInt(inputAsArray[i]);
                    indexOfMinElement = i;
                }
            }
            if (indexOfMinElement > -1) {
                System.out.println(indexOfMinElement);
            } else {
                System.out.println("No matches");
            }
        }
    }

    //METHODS FIRST

    private static void firstEven(String[] inputAsArray, String token) {
        int neededCount = Integer.parseInt(token);
        if (neededCount > inputAsArray.length) {
            System.out.println("Invalid count");
        } else {
            int countEven = 0;
            for (int i = 0; i <= inputAsArray.length - 1; i++) {
                if (Integer.parseInt(inputAsArray[i]) % 2 == 0){
                    countEven++;
                }
            }
            int[] array = new int[Math.min(countEven, neededCount)];
            if (array.length > 0) {
                int index = 0;

                for (int i = 0; i <= inputAsArray.length - 1; i++) {
                    if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                        array[index] = Integer.parseInt(inputAsArray[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }

                System.out.print("[");
                for (int i = 0; i <= array.length - 1; i++) {
                    if (i == array.length - 1) {
                        System.out.print(array[i]);
                    } else {
                        System.out.print(array[i] + ", ");
                    }

                }

                System.out.println("]");

            } else {
                System.out.println("[]");
            }
        }
    }

    private static void firstOdd(String[] inputAsArray, String token) {
        int neededCount = Integer.parseInt(token);
        if (neededCount > inputAsArray.length) {
            System.out.println("Invalid count");
        } else {
            int countOdd = 0;
            for (int i = 0; i <= inputAsArray.length - 1; i++) {
                if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                    countOdd++;
                }

            }

            int[] array = new int[Math.min(countOdd, neededCount)];
            if (array.length > 0) {
                int index = 0;
                for (int i = 0; i < inputAsArray.length - 1; i++) {
                    if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                        array[index] = Integer.parseInt(inputAsArray[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }

                System.out.print("[");
                for (int i = 0; i <= array.length - 1; i++) {
                    if (i == array.length - 1) {
                        System.out.print(array[i]);
                    } else {
                        System.out.print(array[i] + ", ");
                    }

                }
                System.out.println("]");

            } else {
                System.out.println("[]");
            }

        }
    }

    //METHODS LAST

    private static void lastEven(String[] inputAsArray, String token) {
        int neededCount = Integer.parseInt(token);
        if (neededCount > inputAsArray.length) {
            System.out.println("Invalid count");
        } else {
            int countEven = 0;
            for (int i = 0; i <= inputAsArray.length - 1; i++) {
                if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                    countEven++;
                }

            }
            int[] array = new int[Math.min(countEven, neededCount)];
            if (array.length > 0) {
                int index = 0;
                for (int i = inputAsArray.length - 1; i >= 0; i--) {
                    if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                        array[index] = Integer.parseInt(inputAsArray[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }

                }
                int[] reversedArray = new int[array.length];
                for (int i = 0; i <= reversedArray.length - 1; i++) {
                    reversedArray[i] = array[array.length - (i + 1)];

                }
                System.out.print("[");
                for (int i = 0; i <= reversedArray.length - 1; i++) {
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

    private static void lastOdd(String[] inputAsarray, String token) {
        int neededCount = Integer.parseInt(token);
        if (neededCount > inputAsarray.length) {
            System.out.println("Invalid count");
        } else {
            int countOdd = 0;
            for (int i = 0; i <= inputAsarray.length - 1; i++) {
                if (Integer.parseInt(inputAsarray[i]) % 2 != 0) {
                    countOdd++;
                }
            }
            int[] array = new int[Math.min(countOdd, neededCount)];
            if (array.length > 0) {
                int index = 0;
                for (int i = inputAsarray.length - 1; i >= 0; i--) {
                    if (Integer.parseInt(inputAsarray[i]) % 2 != 0) {
                        array[index] = Integer.parseInt(inputAsarray[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }

                }
                int[] reversedArray = new int[array.length];
                for (int i = 0; i <= reversedArray.length - 1; i++) {
                    reversedArray[i] = array[array.length - (i + 1)];
                }

                System.out.print("[");
                for (int i = 0; i <= reversedArray.length - 1; i++) {
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
