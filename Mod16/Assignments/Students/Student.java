/**
 * 
 * @author Max Gordon
 * @version 03/30/2020
 */

public class Student {
    int[] quizzes;
    String name;

    public Student(String name, int q1, int q2, int q3, int q4, int q5) {
        int[] q = {q1, q2, q3, q4, q5};
        quizzes = q;
        this.name = name;
    }

    public int getQuiz(int quizNumber) {
        return quizzes[quizNumber - 1];
    }

    public void setQuiz(int quizNumber, int score) {
        quizzes[quizNumber - 1] = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; 
    }
    
    public String toString() {
        return name + " scored a " + quizzes[0] + ", " + quizzes[1] + ", " + quizzes[2] + ", " + quizzes[3] +  ", and " + quizzes[4] ;
    }
}