package Fundamentals.January_2023.P23ExerciseObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class P1AdvertisementMessage {

    static class Advertising{
        String phrases;
        String events;
        String authors;
        String cities;

        public Advertising (String phrasesObj, String eventsObj, String authorsObj, String citiesObj){
            this.phrases = phrasesObj;
            this.events = eventsObj;
            this.authors = authorsObj;
            this.cities = citiesObj;
        }

        //Setters
        public void setPhrases(String phrasesObj){
            this.phrases = phrasesObj;
        }
        public void setEvents(String eventsObj){
            this.events = eventsObj;
        }
        public void setAuthors(String authorsObj){
            this.authors = authorsObj;
        }
        public void setCities(String citiesObj){
            this.cities = citiesObj;
        }

        //Getters
        public String getPhrases(){
            return this.phrases;
        }
        public String getEvents(){
            return this.events;
        }
        public String getAuthors(){
            return this.authors;
        }
        public String getCities(){
            return this.cities;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        printPhrase();

        for (int i = 1; i <= num; i++) {
            System.out.printf("%s %s %s - %s%n", printPhrase(), printEvent(), printAuthor(), printCity());

        }

    }

    public static String printPhrase (){

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        Random rand = new Random();
        int randomIndex = rand.nextInt(phrases.length);
        String randomString = phrases[randomIndex];
        return randomString;

    }

    public static String printEvent (){
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        Random rand = new Random();
        int randomIndex = rand.nextInt(events.length);
        String randomString = events[randomIndex];
        return randomString;
    }

    public static String printAuthor (){
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        Random rand = new Random();
        int randomIndex = rand.nextInt(authors.length);
        String randomString = authors[randomIndex];
        return randomString;
    }

    public static String printCity(){
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random rand = new Random();
        int randomIndex = rand.nextInt(cities.length);
        String randomString = cities[randomIndex];
       return randomString;
    }
}
