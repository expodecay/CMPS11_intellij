/**
 * Created by Rick on 1/28/2016.
 */
import java.util.Scanner;
public class pa3 {
    public static void main(String[] args) {
        int a, b, q = 1, r;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer: ");
            while (!input.hasNextInt()) {
                System.out.print("Enter a positive integer: ");
                input.next();
            }
            a = input.nextInt();
        } while (a <= 0);

        do {
            System.out.print("Enter another positive integer: ");
            while(!input.hasNextInt()){
                System.out.print("Enter another positive integer: ");
                input.next();
            }
            b = input.nextInt();
        }while(b<=0);

        int first = a, second = b;
        r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        System.out.println("The GCD of " + first + " and " + second + " is " + b);

    }
}