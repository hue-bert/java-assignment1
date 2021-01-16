import java.util.Scanner;

public class EqualSumChecker {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = scanner.nextInt();

        System.out.println("Enter second number");
        num2 = scanner.nextInt();

        System.out.println("Enter third number to check if number and two equal");
        num3 = scanner.nextInt();

        System.out.println(hasEqualSum(num1, num2, num3));

    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        int result = num1 + num2;

        if (result == num3) {
            return true;
        } else {
            return false;
        }
    }
}
