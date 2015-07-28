/*Modify the Student class of Exercise P8.7 to compute grade point averages. Meth­ods
are needed to add a grade and get the current GPA. Specify grades as elements of a
class Grade . Supply a constructor that constructs a grade from a string, such as "B+".
You will also need a method that translates grades into their numeric values (for
example, "B+" becomes 3.3).*/

public class P8_08B {
    private String grade;
    private double score;

    public P8_08B(String grade) {
        this.grade = grade;
        this.score = 0;
    }

    public void gradeToScore() {
        char gradeLetter = this.grade.charAt(0);
        char gradeSign = ' ';

        if (this.grade.length() == 2) {
            gradeSign = this.grade.charAt(1);
        }

        if (gradeLetter == 'A') {
            score = 4;
        } else if (gradeLetter == 'B') {
            score = 3;
        } else if (gradeLetter == 'C') {
            score = 2;
        } else if (gradeLetter == 'D') {
            score = 1;
        } else if (gradeLetter == 'F') {
            score = 0;
        }

        if (gradeSign == '+') {
            score += 0.3;
        } else if (gradeSign == '-') {
            score -= 0.3;
        }
    }

    public double getScore() {
        this.gradeToScore();
        return this.score;
    }
}