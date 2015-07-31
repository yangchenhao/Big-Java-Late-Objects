/*Make a class Employee with a name and salary. Make a class Manager inherit from
Employee . Add an instance variable, named department , of type String . Supply a method
toString that prints the manager’s name, department, and salary. Make a class Execu­tive
inherit from Manager . Supply appropriate toString methods for all classes. Supply
a test program that tests these classes and methods.*/

public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.setDepartment(department);
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return super.toString() + " department: " + this.getDepartment();
    }
}