import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = scanner.nextInt();

        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;

        System.out.println("Average Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
            System.out.println("Remarks: Excellent");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Very Good");
        } else if (percentage >= 70) {
            System.out.println("Grade: B+");
            System.out.println("Remarks: Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Satisfactory");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Needs Improvement");
        } else {
            System.out.println("Grade: F");
            System.out.println("Remarks: Fail");
        }
    }
}
