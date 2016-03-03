package Midterm2;

/**
 * Complete the methods getMaxIndex() and getMinIndex() in the Java program below. These
   function should return the index at which the maximum (respectively minimum) value of its array
   argument is stored. Functions getMaxIndex() and getMinIndex() should work on any int array of
   any length, not just the one specified in function main() below.
 */
public class problem7 {
    public static void main(String[] args){
        int [] list = {3, 9, 6, 12, 23, -25, 54, 9, 0, -12, 27};
        System.out.println(list[getMaxIndex(list)]); // prints 54
        System.out.println(list[getMinIndex(list)]); // prints -25
    }
    static int getMaxIndex(int[] A){
        int temp = 0;                       // Temporary index
        for(int i = 0; i<A.length; i++) {
            if (A[i] > A[temp]) {           // If the element at i is larger than element at temp
                temp = i;                   // Assign temp to new value
            }
        }
        return temp;
    }

    static int getMinIndex(int[] A){
        int i, min_index=0;
        for(i = 0; i<=A.length-1; i++){
            if( A[i] < A[min_index] )
                min_index = i;
        }
        return min_index;
        }
}
