package Fundamentals.Mai_2022.P14Methods;
import java.util.Arrays;
import java.util.Scanner;
public class P3PrintingTriangleWithArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNum = Integer.parseInt(scan.nextLine());

        triangleIncrease(inputNum);
        triangleDecrease(inputNum);

    }

    public static void triangleIncrease(int num){
        for (int i = 1; i <= num; i++) {
           int[] line = new int[i];


            int[] secondLine = new int[i];
            secondLine[0] = 1;

            for (int j = 2; j <= i; j++) {

                secondLine[j-1] = j;

            }
            line = secondLine;

            System.out.println(Arrays.toString(line).replace("[", "").replace(",", "").replace("]", ""));

            }
        }

        public static void triangleDecrease(int num){

            for (int i = num - 1; i > 0; i--) {
                int[] line = new int[i];


                int[] secondLine = new int[i];
                secondLine[0] = 1;

                for (int j = i; j > 0; j--) {

                    secondLine[j-1] = j;

                }
                line = secondLine;

                System.out.println(Arrays.toString(line).replace("[", "").replace(",", "").replace("]", ""));

            }


        }

        }


