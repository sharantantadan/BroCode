import java.util.Scanner;
import java.util.Random;

public class numberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int guess = 0;
        int min = 1;
        int max = 100;
        int attempts = 0;
        int randomnum = random.nextInt(min, max + 1);
        System.out.println("NUMBER GUESSING GAME");

        do {

            System.out.printf("Enter Your Guess between %d - %d:", min, max);
            guess = sc.nextInt();
            attempts++;
            if (guess < randomnum) {
                System.out.println("GUESS IS TOO LOW!");
            } else {
                System.out.println("GUESS IS TOO HIGH!");
            }
        } while (guess != randomnum);
        System.out.println("Your Guess is CORRECT!!!");
        System.out.println("Number of Attempts: " + attempts);
        sc.close();
    }
}
