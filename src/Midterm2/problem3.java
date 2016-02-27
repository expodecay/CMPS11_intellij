package Midterm2;

/**
 * Determine the output of the following Java program. Note that the function f() is recursive.
 * */
public class problem3 {
    public static void main(String[] args) {
        System.out.println(f(7));
    }
    static int f(int n){
        System.out.println( "f(" + n + ")" );
        if(n<=1)
            return 2; // And a final value of 2 to the total.
        else
            return f(n-1) + 5;  // Keeps calling/printing f(n-1) but only adds 5 to each iteration
    }

}
/*
* Within f(n-1) another value of 5 gets carried through until f(1) hits.
*
*   if n = 7, we have
*
*       f(7-1) + 5
*           f(6-1) + 5
*               f(5-1) + 5
*                   f(3-1) + 5
*                       f(2-1) + 5
*                     --------------
*                                30
*                       f(2)  ->  2
*                    ----------------
*                                32
*
* See problem for if it still doesn't make sense.
* */

