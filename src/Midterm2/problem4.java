package Midterm2;

import java.util.Scanner;

/**
 * Write a recursive function called sum() that takes a single int n as input and returns the sum of the
   positive integers from 1 to n. (Hint: this is the same as the recursive function that computes n! (n
   factorial) discussed in class, except with multiplication replaced by addition.)

 */
public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an integer: ");
        int a = input.nextInt();
        int b = sum(a);
        System.out.println(b);
    }

    // Recursive version
    static int sum(int n){
        if(n <= 1){         // Base case
            return 1;
        }
        else{
            return sum(n - 1) + n;
        }
    }

    // Non-recursive version
   /* static int sum(int n){
        int total = 0;
        for(int i = 0; i<=n; i++){
            total+=i;
        }
        return total;
    }   */
}
/*
* Base case: n = 1 -> return 1
* else return call to function decremented by 1 plus the current value of n
*/