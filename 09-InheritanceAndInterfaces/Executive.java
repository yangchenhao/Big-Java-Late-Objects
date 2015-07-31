/*Make a class Employee with a name and salary. Make a class Manager inherit from
Employee . Add an instance variable, named department , of type String . Supply a method
toString that prints the manager’s name, department, and salary. Make a class Execu­tive
inherit from Manager . Supply appropriate toString methods for all classes. Supply
a test program that tests these classes and methods.*/

public class Executive extends Manager {
    private double bonus;

    public Executive(String name, double salary, String department, double bonus) {
        super(name, salary, department);
        setBonus(bonus);
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return super.toString() + " bonus: " + this.getBonus();
    }
}