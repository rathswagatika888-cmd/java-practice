
import java.util.*;

public class numberguess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        System.out.println("enter a number to guess:");
        while (true) {
            guess = sc.nextInt();
            attempts++;
            if (guess == num) {
                System.out.println("you guess the number");
                System.out.println("Total guesses: " + attempts);
                break;
            } else if (guess > num) {
                System.out.println("number is lower");
            } else {
                System.out.println("number is higher");
            }
        }
    }

}
