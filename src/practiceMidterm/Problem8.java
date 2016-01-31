package practiceMidterm;
/**
 * Created by Rick on 1/30/2016.
 *
 * PROMPTS THE USER FOR FIVE INTEGERS (ONE BY ONE). REPEATS IF TOKEN OTHER THAN INT IS ENTERED. ARRANGES IN ASSENDING ORDER.
 */
import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
        int a=0 , b = 0, c = 0, d = 0, e = 0, temp, i = 0;  // MUST INITIALIZE VARIABLES!!
        Scanner input = new Scanner(System.in);
        while (i < 5) {
            System.out.print("Enter an integer: ");
            while (true) {
                while (!input.hasNextInt()) {
                    System.out.println("Not an integer!!");
                    System.out.print("Enter an integer: ");
                    input.next();
                }
                if (i < 1) {a = input.nextInt();break;}
                if (i < 2) {b = input.nextInt();break;}
                if (i < 3) {c = input.nextInt();break;}
                if (i < 4) {d = input.nextInt();break;}
                if (i < 5) {e = input.nextInt();break;}
            }
            i++;
        }
        if (a > b) {temp = a;a = b;b = temp;}
        if (b > c) {temp = b;b = c;c = temp;}
        if (c > d) {temp = c;c = d;d = temp;}
        if (d > e) {temp = d;d = e;e = temp;}

        if (a > b) {temp = a;a = b;b = temp;}
        if (b > c) {temp = b;b = c;c = temp;}
        if (c > d) {temp = c;c = d;d = temp;}

        if (a > b) {temp = a;a = b;b = temp;}
        if (b > c) {temp = b;b = c;c = temp;}

        if (a > b) {temp = a;a = b;b = temp;}
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    }
}
