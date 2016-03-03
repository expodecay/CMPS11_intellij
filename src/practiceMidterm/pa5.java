package practiceMidterm;

import java.util.Arrays;

/**
 * Created by Rick on 2/28/2016.
 */
public class pa5 {
    public static void main(String[] args) {
        int[] ass = {1,2,3};

        //31524
        int[] a = {2,4,1,5,3};
        int[] b = {1,4,2,5,3};
        boolean c = isSolution(a);
        boolean d = isSolution(b);
        System.out.println(c);
       // System.out.println(d);
        System.out.println("test");
        //initializer(5);
    }
    static boolean isSolution(int[] A){
        boolean solution = true;
        int i;
        for (i = 0; i <= A.length-2; i++) {
           //System.out.println(i);
            for(int j = i+1; j<= A.length-1; j++) {
                System.out.println("j:" +j);

                System.out.println(Math.abs(A[i] - A[j]) == Math.abs((i - (j))));

                if (Math.abs(A[i] - A[j]) == Math.abs((i - (j)))) {
                    i=A.length-2;
                    solution = false;
                    break;
                }
                else
                    solution = true;
                break;
            }
        }
        return solution;

    }
    static void nextPermutation(int[] A) {
        permuteTracker(A,0);
    }

    static void permuteTracker(int[] A, int index){
        // Base case
        // If we reach the end of the array, there is nothing else to permute
        if(index > A.length-1){
            if(isSolution(A)){
                show(A);
                return;
            }

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
/*
* static boolean isSolution(int[] A){
        boolean solution = false;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] - A[i + 1] == (i -(i+1))) {
                solution = false;
                break;
            }
            else
                solution = true;

        }
        return solution;
* */