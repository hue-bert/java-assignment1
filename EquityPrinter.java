import java.util.Scanner;

public class EquityPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter first number:");
        num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        num2 = scanner.nextInt();
        System.out.println("Enter third number:");
        num3 = scanner.nextInt();
        printEqual(num1, num2, num3);
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a == b || b == c || a == c) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
