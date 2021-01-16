import java.util.Scanner;

public class DecimalComparator {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double decimal1, decimal2;
        System.out.println("Enter first decimal to compare:");
        decimal1 = scanner.nextDouble();
        System.out.println("Enter second decimal to compare:");
        decimal2 = scanner.nextDouble();
        System.out.println(areEqualByThreeDecimalPlaces(decimal1, decimal2));
    }*/

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        int result1 = (int) (num1 * 1000);
        int result2 = (int) (num2 * 1000);
        if (result1 == result2) {
            return true;
        } else {
            return false;
        }
    }
}
