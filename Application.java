package calculator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to CLI Calculator!");
        System.out.println("Available operations: add, subtract, multiply, divide, factorial");
        System.out.print("Enter an operation: ");
        String operation = scanner.nextLine().trim().toLowerCase();

        // Perform operation based on user input
        switch (operation) {
            case "add":
                performAddition(scanner);
                break;
            case "subtract":
                performSubtraction(scanner);
                break;
            case "multiply":
                performMultiplication(scanner);
                break;
            case "divide":
                performDivision(scanner);
                break;
            case "factorial":
                performFactorial(scanner);
                break;
            default:
                System.out.println("Unsupported operation. Please choose from the available operations.");
        }

        scanner.close();
    }

    private static void performAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void performDivision(Scanner scanner) {
        System.out.print("Enter the dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    private static void performFactorial(Scanner scanner) {
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Error: Factorial is defined only for non-negative integers.");
        } else {
            int factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }

    private static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
