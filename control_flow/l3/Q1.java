
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("The year is a Leap Year.");
                    } else {
                        System.out.println("The year is not a Leap Year.");
                    }
                } else {
                    System.out.println("The year is a Leap Year.");
                }
            } else {
                System.out.println("The year is not a Leap Year.");
            }
        } else {
            System.out.println("Invalid input. Enter a year >= 1582.");
        }
    }
}
