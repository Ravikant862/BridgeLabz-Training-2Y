import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("The year is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println("The year is not a Leap Year.");
        } else {
            System.out.println("Invalid input. Enter a year >= 1582.");
        }
    }
}
