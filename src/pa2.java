/**
 * pa2.java
 * Rick Ramirez
 * riryrami
 * Guess.java
 * This program generates a random number, then gives the user three chances to guess the number through the keyboard.
 */

import java.util.Scanner;
public class pa2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randNum = 1 + (int)(Math.random() * 10);

        System.out.println("I'm thinking of an integer in the range 1 to 10. You have three guesses.\n");
        int guess;
        String[] ass = {"first", "second", "third"};

        for (int i=0; i<3; i++){
            System.out.print("Enter your " + ass[i] + " guess: ");
            guess = input.nextInt();

            if(guess == randNum){
                System.out.println("You win!");
                break;
            }
            if(guess < randNum){
                System.out.println("Your guess is too low.\n");
            }
            if(guess > randNum){
                System.out.println("Your guess is too high.\n");
            }
            if( i >= 2){
                System.out.println("You lose. The number was " + randNum + ".");
            }
        }
    }
}
