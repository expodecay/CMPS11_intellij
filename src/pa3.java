/**
 * pa3.java
 * Rick Ramirez
 * riryrami
 * GCD.java
 * This program uses do-while loops to take input from the user. If the user enters anything other than a positive
 * integer, the loop reiterates. Once two positive integers are obtained, the program proceeds to calculate and print
 * the greatest common divisor between them.
 */
import java.util.Scanner;
public class pa3 {
    public static void main(String[] args) {
        int a, b, r;

        // Create a new scanner object
        Scanner input = new Scanner(System.in);

        // First do-while
        do {
            System.out.print("Enter a positive integer: ");
            while (!input.hasNextInt()) {                      // hasNextInt() returns true is next token is an integer.
                System.out.print("Enter a positive integer: ");
                input.next();                   // If not true, the program discards that input and continues to listen.
            }
            a = input.nextInt();
        } while (a <= 0);                       // end loop condition

        // Second do-while
        do {
            System.out.print("Enter another positive integer: ");
            while(!input.hasNextInt()){
                System.out.print("Enter another positive integer: ");
                input.next();  // Needed to prevent infinite loop. Open to any data type, so will not crash.
            }
            b = input.nextInt();
        }while (b <= 0);

        // Calculate greatest common divisor using Euclidean Algorithm.
        int first = a, second = b;  // Store users input
        r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;  // Loop terminates when the remainder is zero.
        }
        System.out.println("The GCD of " + first + " and " + second + " is " + b);
    }
}
/*
* DO-WHILE LOOP:
*
*  A variation of the while loop. Its syntax is:
*
*   do{
*       //loop body
*       Statement(s);
*   } while (loop-continuation-condition)
*
* The loop executes the body first, then checks the loop condition.
* */

/*
* EUCLIDEAN ALGORITHM
*
*          a = q_0 * b + r_0
*
*          b = q_1 * r_0 + r_1
*
*          r_0 = q_2 * r_1 + r_2 ...
*
* Where a and b are teh two numbers being considered, q is the quotient between them, and r is the remainder.
* */