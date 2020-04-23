/**
 * 
 * @author Max Gordon
 * @version 04/23/2020
 */

public class StudentGradesTester {
    public static void main(String[] args) {
        worksFine();
        // badFirstName();
        // badLastName();
        // badScores();
    }

    public static void worksFine() {
        StudentGrades student1 = new StudentGrades("Bob", "Dylan", 99, 78, 83, 85, 96);
        StudentGrades student2 = new StudentGrades("Phil", "Steveson", 94, 87, 74, 95);
        StudentGrades student3 = new StudentGrades("John", "Green", 84, 94, 100);
        
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }

    public static void badFirstName() {
        StudentGrades student1 = new StudentGrades("  ", "Dylan", 99, 78, 83, 85, 96);
        
        System.out.println(student1);
    }

    public static void badLastName() {
        StudentGrades student1 = new StudentGrades("Bob", "  ", 99, 78, 83, 85, 96);
        
        System.out.println(student1);
    }

    public static void badScores() {
        StudentGrades student1 = new StudentGrades("Bob", "Dylan");
        
        System.out.println(student1);
    }
}