/*Modify the Student class of Exercise P8.7 to compute grade point averages. Meth­ods
are needed to add a grade and get the current GPA. Specify grades as elements of a
class Grade . Supply a constructor that constructs a grade from a string, such as "B+".
You will also need a method that translates grades into their numeric values (for
example, "B+" becomes 3.3).*/

public class P8_08A {
    String name;
    int totalSumOfGrades;
    int numberOfGrades;

    public P8_08A(String name) {
        this.name = name;
        this.totalSumOfGrades = 0;
        this.numberOfGrades = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getAverageGrade() {
        return this.totalSumOfGrades / this.numberOfGrades;
    }

    public void addGrade(P8_08B grade) {
        this.numberOfGrades++;
        this.totalSumOfGrades += grade.getScore();
    }
}