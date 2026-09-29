import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = console.nextInt();
        System.out.println("Enter second number");
        int secondNumber = console.nextInt();
        firstTest(firstNumber, secondNumber);
        console.close();
    }

    public static void firstTest(int a, int b) {
        if (a == b) {
            System.out.println(a + " = " + b);
        } else if (a > b) {
            System.out.println(a + " > " + b);
        } else {
            System.out.println(a + " < " + b);
        }
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        if (b == 0) {
            System.out.println("Second number cannot be zero");
        } else {
            System.out.println(a + " / " + b + " = " + ((double) a / b));
        }
    }
}
