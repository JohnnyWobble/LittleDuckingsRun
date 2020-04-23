/**
 * 
 * @author Max Gordon
 * @version 04/23/2020
 */

public class StudentGrades {
    private String firstName, lastName;
    private double[] scores;

    public StudentGrades(String firstName, String lastName, double... scores) {
        if (firstName.strip().equals("")) {
            throw new IllegalArgumentException("`firstName` cannot be empty");
        } 
        if (lastName.strip().equals("")) {
            throw new IllegalArgumentException("`lastName` cannot be empty");
        }
        if (scores.length == 0) {
            throw new IllegalArgumentException("`scores` cannot be empty");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
    }

    public static String getLetterGrade(double[] scores) {
        if (scores.length == 0) {
            throw new IllegalArgumentException("`scores` needs at least one element");
        }
        double average = 0;
        String letterGrade;

        for (double s : scores) {
            average += s;
        }
        average /= scores.length;

        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }

    @Override
    public String toString() {
        String arrayString = "";
        for (double s : scores) {
            arrayString += (s + "  ");
        }
        return String.format("%-10s  %-10s - %1s: ", firstName, lastName, getLetterGrade(scores)) + arrayString;
    }
}