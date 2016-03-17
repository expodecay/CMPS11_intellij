package FinalReview;

/**
 * Created by Rick on 3/15/2016.
 */
import java.util.Scanner;
class EchoWords{
    public static void main(String[] args) {
        /*
        String nextWord;
        Scanner input = new Scanner(System.in);
        nextWord = input.next();
        while(!nextWord.equals("galumph")){
            System.out.println(nextWord);
            nextWord = input.next();
        }
        System.out.println("bye!");
        */
        for(int i = 0; i<args.length; i++){
            if(args[i].equals("galumph")){
                System.out.println("Bye!");
                System.exit(0);
            }
            System.out.println(args[i]);
        }
    }
}
