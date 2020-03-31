import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Max Gordon
 * @version 03/30/2020
 */

public class StudentTester {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Bob", 65, 83, 74, 95, 67));
        students.add(new Student("Sara", 69, 74, 75, 52, 45));
        students.add(new Student("Jack", 82, 83, 85, 65, 87));
        students.add(new Student("Jill", 66, 89, 94, 88, 90));
        students.add(new Student("Owen", 86, 68, 71, 99, 70));

        System.out.println("\t<< Starting gradebook >>\n");
        showData(students);

        System.out.println("\n\t<< Renaming Sara to Nicole >>\n");
        rename(students, "Sara", "Nicole");
        showData(students);

        System.out.println("\n\t<< Setting Jack's 2nd quiz to 100 >>\n");
        setQuiz(students, "Jack", 2, 100);
        showData(students);

        System.out.println("\n\t<< Replacing Owen with John, 83, 96, 66, 87, 92 >>\n");
        replaceStudent(students, "Owen", "John", 83, 96, 66, 87, 92);
        showData(students);

        System.out.println("\n\t<< Adding Anna, 89, 76, 96, 67, 97 before Jack >>\n");
        addBefore(students, "Jack", "Anna", 89, 76, 96, 67, 97);
        showData(students);

        System.out.println("\n\t<< Removing Bob >>\n");
        deleteStudent(students, "Bob");
        showData(students);
    }

    public static void showData(List<Student> students) {
        System.out.println("Name     Quiz 1     Quiz 2     Quiz 3     Quiz 4     Quiz 5");
        System.out.println("--------------------------------------------------------------------");

        for (Student s : students) {
            System.out.printf("%-9s%4d%11d%11d%11d%11d\n", s.getName(), s.getQuiz(1), s.getQuiz(2), s.getQuiz(3),
                    s.getQuiz(4), s.getQuiz(5));
        }
    }

    public static void rename(List<Student> students, String name, String renameTo) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.get(i).setName(renameTo);
                break;
            }
        }
    }

    public static void setQuiz(List<Student> students, String name, int quizNum, int newScore) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.get(i).setQuiz(quizNum, newScore);
                break;
            }
        }
    }

    public static void replaceStudent(List<Student> students, String name, String newName, int q1, int q2, int q3,
            int q4, int q5) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.set(i, new Student(newName, q1, q2, q3, q4, q5));
                break;
            }
        }
    }

    public static void addBefore(List<Student> students, String name, String newName, int q1, int q2, int q3, int q4,
            int q5) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.add(i, new Student(newName, q1, q2, q3, q4, q5));
                break;
            }
        }
    }

    public static void deleteStudent(List<Student> students, String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                break;
            }
        }
    }
}