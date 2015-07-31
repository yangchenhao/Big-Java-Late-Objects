/*Implement a superclass Person . Make two classes, Student and Instructor , that inherit
from Person . A person has a name and a year of birth. A student has a major, and
an instructor has a salary. Write the class declarations, the constructors, and the
methods toString for all classes. Supply a test program that tests these classes and
methods.*/

public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        setSalary(salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + " salary: " + this.getSalary();
    }
}