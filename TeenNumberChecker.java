import java.util.Scanner;

public class TeenNumberChecker {

    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first teen number");
        num1 = scanner.nextInt();

        System.out.println("Enter first teen number");
        num2 = scanner.nextInt();

        System.out.println("Enter first teen number");
        num3 = scanner.nextInt();

        System.out.println(hasTeen(num1, num2, num3));

        System.out.println("\nEnter a teen number");
        num4 = scanner.nextInt();

        System.out.println(isTeen(num4));
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        if ((13 <= age1 && 19 >= age1) ||
                (13 <= age2 && 19 >= age2) ||
                (13 <= age3 && 19 >= age3)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int num) {
        if (13 <= num && 19 >= num){
            return true;
        }
        else {
            return false;
        }
    }
}
