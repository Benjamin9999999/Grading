import java.util.Random;
import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        // Define the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create an array to store the grades of each student
        double[] grades = new double[numStudents];

        // Generate random grades for each student
        for (int i = 0; i < numStudents; i++) {
            grades[i] = generateRandomGrade();
        }

        // Display generated grades
        System.out.println("Generated Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }

        // Calculate and display the average grade
        double total = 0;
        for (int i = 0; i < numStudents; i++) {
            total += grades[i];
        }
        double average = total / numStudents;
        System.out.println("Average Grade: " + average);

        // Display grades above the average
        System.out.println("Grades above the average:");
        for (int i = 0; i < numStudents; i++) {
            if (grades[i] > average) {
                System.out.println("Student " + (i + 1) + ": " + grades[i]);
            }
        }

        scanner.close();
    }

    // Function to generate a random grade between 0 and 100
    private static double generateRandomGrade() {
        return (int)(Math.random() * 100 ) ;
    }
}
