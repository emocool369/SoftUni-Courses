package Basics.L09ForCicle.P10Excercises2;




    import java.util.Scanner;

public class P05AnotherSolution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //за всеки един таб от първия  до последния
            //-> прочитам името на сайта -> проверявам името на сайта дали е за глоба
            int tabs = Integer.parseInt(scanner.nextLine());
            int salary = Integer.parseInt(scanner.nextLine());

            for (int tab = 1; tab <= tabs ; tab++) {
                String siteName = scanner.nextLine(); //Facebook, Instagram, Reddit
                switch(siteName) {
                    case "Facebook":
                        salary -= 150; //salary = salary - 150;
                        break;
                    case "Instagram":
                        salary -= 100;
                        break;
                    case "Reddit":
                        salary -= 50;
                        break;
                }

                if(salary <= 0) {
                    System.out.println("You have lost your salary.");
                    break;
                }

            }

            if(salary > 0) {
                System.out.println(salary);
            }

        }
    }
