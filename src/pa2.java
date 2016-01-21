/**
 * Created by Rick on 1/19/2016.
 */
import java.util.Scanner;
public class pa2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randNum = 1 + (int)(Math.random() * 10);

        System.out.println(randNum);

        System.out.println("I'm thinking of an integer in the range 1 and 10. You have three guesses.\n");
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
                System.out.println("You lose. The number was " + randNum);
            }
        }
    }
}
