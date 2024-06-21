import java.util.ArrayList;
import java.util.List;

public class SELF3_design$Student {
    // Student class to hold the name and grade
    static class Student {
        String name;
        double grade;

        Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        public static void main(String[] args) {


            // List of students
            List<Student> students = new ArrayList<>();
            students.add(new Student("Nikhil", 90.5));
            students.add(new Student("Amol ", 82.0));
            students.add(new Student("Charlie", 88.75));
            students.add(new Student("Parth", 91.0));

            // Print header
            String headerFormat = "%-10s | %-6s%n";
            String rowFormat = "%-10s | %-6.2f%n";
            System.out.printf(headerFormat, "Name", "Grade");
            System.out.println("---------------------");

            // Print student grades
            for (Student student : students) {
                System.out.printf(rowFormat, student.name, student.grade);
            }

            // Calculate and print average grade
            double total = 0;
            for (Student student : students) {
                total += student.grade;
            }
            double average = total / students.size();
            System.out.println("---------------------");
            System.out.printf(rowFormat, "Average", average);

        }
    }
}



