package Midterm2;

/**
 * Fill in the definition of function concatenate() below. This function takes as input two int arrays A
   and B, of any length, and returns a new int array which is the concatenation of A and B, i.e. the length of
   the returned array is the sum of the lengths of A and B, and the contents of the returned array are the
   values in A followed by the values in B.
 */
import java.util.Arrays;
public class problem2 {
    public static void main(String[] args) {
        int[] one = {1,2,3,4,9,9};
        int[] two = {5,6,7,8};
        int[] three = concatenate(one, two);
        System.out.println(Arrays.toString(three));
    }

    static int[] concatenate(int[] A, int[] B){
        int[] three = new int[A.length + B.length];
         for(int i  = 0; i < A.length; i++){                // loop up the length of A
             three[i] =A[i];
         }
        for(int i = A.length; i < A.length+B.length; i++){  // loop up the from the end of A to the total length
            three[i] = B[i-A.length];                       // need to match index 0 in array B
        }

    return three;
    }
}


