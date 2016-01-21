/**
 * Created by Rick on 1/19/2016.
 */
import java.util.Scanner;
public class pa2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randNum = (int)(Math.random()*10);
        System.out.println("I'm thinking of an integer between 1 and 10. You have three guesses");
        int guess;
        String[] ass = {"first", "second", "third"};

        System.out.println(randNum);

        for (int i=0; i<3; i++){
            System.out.println("Enter your " + ass[i] + " guess.");
            guess = input.nextInt();

            System.out.println(i);
            if( i >= 2 && guess != randNum){
                System.out.println("You lose. The number was " + randNum);
                break;
            }
            if(guess == randNum){
                System.out.println("You win!");
            }
            if(guess < randNum){
                System.out.println("Your guess is too low.");
            }
            if(guess > randNum){
                System.out.println("Your guess is too high.");
            }
        }

        System.out.println("RandNum: " + randNum);

    }
}
