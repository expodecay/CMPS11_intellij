package Midterm2;

import java.util.Scanner;

/**
 * Created by Rick on 2/26/2016.
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
