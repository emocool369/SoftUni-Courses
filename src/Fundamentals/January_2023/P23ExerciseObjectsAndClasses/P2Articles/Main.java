package Fundamentals.January_2023.P23ExerciseObjectsAndClasses.P2Articles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String articleData = scan.nextLine();
        String[] articleParts = articleData.split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {

            String commands = scan.nextLine();

            String command = commands.split(": ")[0];

            switch(command){
                case "Edit":
                    String newContent = commands.split(": ")[1];
                    article.editContent(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = commands.split(": ")[1];
                    article.changeAuthor(newAuthor);

                    break;
                case "Rename":
                    String newTitle = commands.split(": ")[1];
                    article.renameTitle(newTitle);

                    break;
            }

        }

        System.out.println(article.toString());
    }
}
