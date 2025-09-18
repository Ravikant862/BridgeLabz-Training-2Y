import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to perform the operation: ");
        int number = scanner.nextInt();

        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();

        for (int i = 1; i < number; i++) {
            double result;

            switch (op) {
                case "+":
                    result = first + second;
                    System.out.println("Result of iteration " + i + ": " + result);
                    break;

                case "-":
                    result = first - second;
                    System.out.println("Result of iteration " + i + ": " + result);
                    break;

                case "*":
                    result = first * second;
                    System.out.println("Result of iteration " + i + ": " + result);
                    break;

                case "/":
                    if (second != 0) {
                        result = first / second;
                        System.out.println("Result of iteration " + i + ": " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Invalid Operator.");
                    break;
            }
        }
    }
}
