import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();

        char op = input.next().charAt(0);

        double num2 = input.nextDouble();

        double result = 0;

        if (op == '+') {
            result = num1 + num2;
        }
        else if (op == '-') {
            result = num1 - num2;
        }
        else if (op == '*') {
            result = num1 * num2;
        }
        else if (op == '/') {

            if (num2 == 0) {
                System.out.println("Cannot divide by zero");
                return;
            }

            result = num1 / num2;
        }
        else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println(result);
    }
}
