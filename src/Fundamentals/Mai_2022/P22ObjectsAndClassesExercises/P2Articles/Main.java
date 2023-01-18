package Fundamentals.Mai_2022.P22ObjectsAndClassesExercises.P2Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String articleData = scan.nextLine();

        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            String command = scan.nextLine();

            String commandName = command.split("\\: ")[0];
            String newValue = command.split("\\: ")[1];

            switch (commandName){
                case "Edit":
                    article.edit(newValue);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newValue);
                    break;
                case "Rename":
                    article.rename(newValue);
                    break;
            }

        }


        System.out.println(article.toString());
    }
}
