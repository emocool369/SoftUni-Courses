package Fundamentals.Mai_2022.P22ObjectsAndClassesExercises.P2Articles;

public class Article { //клас Article
    //1.характеристики - полета, които описват тези характеристики на класа
    //2.конструктор - създваме обекти с конструктора (конструктора е метод)
    //3.функционалности - методи,които описват всички функционалности на клас



    //1
    private String title;
    private String content;
    private String author;

    //2
    public Article(String title, String content, String author){ //конструктор
        //нов обект от класа Article
    this.title = title;
    this.content = content;
    this.author = author;
    }

    //3
    public void edit (String newContent){
    this.content = newContent;
    }

    public void changeAuthor (String newAuthor){
    this.author = newAuthor;
    }

    public void rename (String newTitle){
    this.title = newTitle;
    }

    //default toString -> "{package}:{class}@{address}"
    //new              -> "{title} - {content}:{author}"
    @Override //пренаписвам и работи по мой избор
    public String toString(){ //пренаписваме метода toString
        return this.title + " - " + this.content + ": " + this.author; //взимам обекта и го изкарва по описания начин title - content:author
    }

}
