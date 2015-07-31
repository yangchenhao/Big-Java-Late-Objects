/*Implement a superclass Person . Make two classes, Student and Instructor , that inherit
from Person . A person has a name and a year of birth. A student has a major, and
an instructor has a salary. Write the class declarations, the constructors, and the
methods toString for all classes. Supply a test program that tests these classes and
methods.*/

public class Student extends Person {
    private String major;

    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        setMajor(major);
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return super.toString() + " major: " + this.getMajor();
    }
}