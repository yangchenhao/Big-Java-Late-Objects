/*Implement a class Student . For the purpose of this exercise, a student has a name
and a total quiz score. Supply an appropriate constructor and methods getName() ,
addQuiz(int score) , getTotalScore() , and getAverageScore() . To compute the latter, you
also need to store the number of quizzes that the student took.*/

public class P8_07 {
    String name;
    int totalQuizScore;
    int numberOfQuizzes;

    public P8_07(String name) {
        this.name = name;
        this.totalQuizScore = 0;
        this.numberOfQuizzes = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getTotalScore() {
        return this.totalQuizScore;
    }

    public void addQuiz(int score) {
        this.numberOfQuizzes++;
        this.totalQuizScore += score;
    }

    public double getAverageScore() {
        return this.totalQuizScore / this.numberOfQuizzes;
    }
}