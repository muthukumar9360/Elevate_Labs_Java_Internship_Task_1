import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("❌ Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Console Calculator ---");
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("Choose operation (+, -, *, /) or type 'exit': ");
            String choice = sc.next();

            double result = 0;

            switch (choice) {
                case "+": result = add(num1, num2); break;
                case "-": result = subtract(num1, num2); break;
                case "*": result = multiply(num1, num2); break;
                case "/": result = divide(num1, num2); break;
                case "exit": 
                    System.out.println("Exiting Calculator. Goodbye!");
                    sc.close();
                    return;
                default: 
                    System.out.println("Invalid operation!");
                    continue;
            }

            System.out.println("✅ Result: " + result);
        }
    }
}
