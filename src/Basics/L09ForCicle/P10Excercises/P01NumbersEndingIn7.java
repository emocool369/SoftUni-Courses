package Basics.L09ForCicle.P10Excercises;

public class P01NumbersEndingIn7 {

    public static void main(String[] args){

        //1. какво действие повтарям: взимам число -> проверявам дали завършва на 7 -> печатам
        //2. къде започвам: 1
        //3. къде свършвам: 1000
        //4. каква промяна правя: +1

        for (int num = 1; num <= 1000; num++){
            if (num % 10 == 7){
                System.out.println(num);
            }
        }

    }
}
