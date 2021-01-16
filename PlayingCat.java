import java.util.Scanner;

public class PlayingCat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean summer;
        int temperature;
        System.out.println("Is it summer:");
        summer = scanner.nextBoolean();
        System.out.println("What is the temperature:");
        temperature = scanner.nextInt();
        System.out.println(isCatPlaying(summer,temperature));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature>25 && temperature<=35 ){
            return true;
        }else if (temperature > 25 && temperature <= 45 && summer == true){
            return true;
        }else {
            return false;
        }
    }
}
