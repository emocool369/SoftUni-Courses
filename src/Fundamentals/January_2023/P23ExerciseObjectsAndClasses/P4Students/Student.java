package Fundamentals.January_2023.P23ExerciseObjectsAndClasses.P4Students;

public class Student implements Comparable<Student>{

    private String firstName;
    private String secondName;
    private double grade;

    public Student(String firstNameObj, String secondNameObj, double gradeObj) {
        this.firstName = firstNameObj;
        this.secondName = secondNameObj;
        this.grade = gradeObj;
    }

    //setters
    public void setFirstName(String firstNameObj) {
        this.firstName = firstNameObj;
    }

    public void setSecondName(String secondNameObj) {
        this.secondName = secondNameObj;
    }

    public void setGrade(double gradeObj) {
        this.grade = gradeObj;
    }

    //getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public double getGrade() {
        return this.grade;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Double.compare(this.grade, otherStudent.grade);
    }
}
