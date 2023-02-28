package Fundamentals.January_2023.P23ExerciseObjectsAndClasses;

public class P1Class {

    static class Advertising {
        String phrases;
        String events;
        String authors;
        String cities;

        public Advertising(String phrasesObj, String eventsObj, String authorsObj, String citiesObj) {
            this.phrases = phrasesObj;
            this.events = eventsObj;
            this.authors = authorsObj;
            this.cities = citiesObj;
        }

        //Setters
        public void setPhrases(String phrasesObj) {
            this.phrases = phrasesObj;
        }

        public void setEvents(String eventsObj) {
            this.events = eventsObj;
        }

        public void setAuthors(String authorsObj) {
            this.authors = authorsObj;
        }

        public void setCities(String citiesObj) {
            this.cities = citiesObj;
        }

        //Getters
        public String getPhrases() {
            return this.phrases;
        }

        public String getEvents() {
            return this.events;
        }

        public String getAuthors() {
            return this.authors;
        }

        public String getCities() {
            return this.cities;
        }
    }
}
