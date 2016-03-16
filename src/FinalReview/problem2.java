package FinalReview;

/**
 * Created by Rick on 3/11/2016.
 *
 * Complete the static method getMax() in the following Java program in such a way that it returns the
   maximum value stored in its 2-dimensional array argument. Note that the array passed to getMax()
   need not be rectangular, i.e. its rows may have differing lengths.
 */
// Problem2.java
class problem2{
    public static void main(String[] args){
        int[][] table = { {3, 9, 6, 12},
                {23, -25, 54},
                {0, -12, 27, 8, 16} };
        System.out.println(getMax(table)); // prints 54
    }

                    //SOLUTION//

    static int getMax(int[][] A){
        int k = A[0][0];
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<A[i].length; j++){
                if(A[i][j]>k){
                    k = A[i][j];
                }
            }
        }
        return k;
    }
}