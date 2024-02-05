import java.util.Scanner;
import java.text.DecimalFormat;
public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.print("How many subjects are you doing? : ");
        int numSubjects = input.nextInt();

        double totalMarks = 0;
        int subjectNum = 1;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the mark for Subject " + subjectNum + " : ");
            double mark = input.nextDouble();

            while (mark < 0 || mark > 100) {
                System.out.print("Invalid mark, please re-marks for Subject " + subjectNum + " (between 0-100) : ");
                mark = input.nextDouble();
            }
            totalMarks += mark;
            subjectNum++;
        }

        double average = totalMarks / numSubjects;
        char grade = ' ';

        if (average >= 90 && average <= 100) {
            grade = 'A';
        } else if (average >= 80 && average < 90) {
            grade = 'B';
        } else if (average >= 70 && average < 80) {
            grade = 'C';
        } else if (average >= 60 && average < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nTotal mark\tAverage Pecentage\tGrade");
        System.out.println(dc.format(totalMarks) + "\t\t" + dc.format(average) + "%\t\t\t" + grade);
    }
}
