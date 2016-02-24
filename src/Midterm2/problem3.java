package Midterm2;

/**
 * Write a recursive function called sum() that takes a single int n as input and returns the sum of the
 positive integers from 1 to n. (Hint: this is the same as the recursive function that computes n! (n
 factorial) discussed in class, except with multiplication replaced by addition.)

 static int sum(int n){. . . . }

 */
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an integer: ");
        int a = input.nextInt();
        int b = sum(a);
        System.out.println(b);
    }

    static int sum(int n){

        int total = 0;
        for(int i = 0; i<=n; i++){
            total+=i;
        }
        return total;
    }
}
