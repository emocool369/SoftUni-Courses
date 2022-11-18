package Basics.L09ForCicle.P10Excercises2;

public class P01NumbersEndingIn7 {
    public static void main(String[] args){

        for (int i = 7; i <= 997; i++){
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
