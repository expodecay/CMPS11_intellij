package practiceMidterm;

import java.util.Arrays;

/**
 * Created by Rick on 2/28/2016.
 */
public class pa5 {
    public static void main(String[] args) {
        int[] ass = {1,2,3};
        initializer(4);
    }
    static void nextPermutation(int[] A) {
        permuteTracker(A,0);
    }

    static void permuteTracker(int[] A, int index){
        // Base case
        // If we reach the end of the array, there is nothing else to permute
        if(index > A.length-1){
            show(A);
            return;
        }
        for(int i = index; i<A.length; i++){
            swap(A, index, i);
            permuteTracker(A, index+1);
            swap(A, index,i);
        }

    }
    static void show(int[] A){
        for (int temp : A)
            System.out.print(temp);
        System.out.print("\n");
    }
    static void initializer(int n){
        int[] a  = new int[n];
        for (int i = 0; i <n; i++)
            a[i] = i+1;
        nextPermutation(a);
    }
    static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
