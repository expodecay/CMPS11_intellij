/**
 * Created by Rick on 3/2/2016.
 */
import java.util.Arrays;
import java.util.Scanner;

public class pa5 {
    public static void main(String[] args) {
        int i, n = args.length;
        for (i = 0; i < n; i++) {
            try {
                int a = Integer.valueOf(args[i]);
                standardOutput(a);
            } catch (NumberFormatException e1) {
                System.out.println("no!");
            }
        }
    }

    // Calculate number of solutions and print them
    static void verboseOutput(int n){
        int[] array =  initialize(n);
        int m = numIterations(n);
        for(int i = 0; i<=m-1; i++) {
            if(i==0) {
                if (isSolution(array)) {
                    print(array);
                }
            }
            next_permutation(array);
            if(isSolution(array)) {
                print(array);
            }
        }
        standardOutput(n);
    }
    static void standardOutput(int n) {
        int numSolutions = 0;
        int[] array = initialize(n);
        int m = numIterations(n);

        for(int i = 0; i<=m-1; i++) {
            if(i==0) {
                if (isSolution(array)) {
                    numSolutions += 1;
                    // ass solution to an array;
                }
            }
            next_permutation(array);
            if(isSolution(array)) {
                numSolutions += 1;
            }

        }
        System.out.println(n+ "-Queens has " + numSolutions + " solutions");
    }

    // Populate the array
    static int[] initialize(int n){
        int[] a  = new int[n];
        for (int i = 0; i <n; i++)
            a[i] = i+1;
        return a;
    }

    // Number of iterations depends on the size of the array and is equal to n!
    static int numIterations(int n){
        if(n == 1){
            return 1;
        }
        else
            return numIterations(n-1)*n;
    }
    public static void print(int[] A) {
        System.out.print("(");
        for(int i=0; i<A.length-1; i++){
            System.out.print(A[i] + ", ");
        }
        System.out.print(A[A.length-1]);
        System.out.print(")");
        System.out.println();
    }

    // Find next permutation
    public static void next_permutation(int[] A) {
        int i, j;
        // Find the largest index i such that a[i] < a[i + 1].
        for (i = A.length - 2; i >= 0; i--) {
            if (A[i] < A[i + 1])
                break;
        }
        if (i < 0) { // If no such index exists, the permutation is the last permutation.
            return;
        }
        // Find the largest index j such that a[i] < a[j]. Because i + 1 is such
        // an index, j is well defined and satisfies i < l.
        for (j = A.length - 1; j > i; j--) {
            if (A[j] > A[i])
                break;
        }
        // Swap a[i] with a[j].
        swap(A, i++, j);
        // Reverse the sequence from a[i + 1] up to and including the final element
        for (j = A.length - 1; j > i; i++, j--) {
            swap(A, i, j);
        }
    }
    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    static boolean isSolution(int[] A){
        boolean solution = true;
        int i,j;
        for (i = 0; i <= A.length-2; i++){ // i runs from A[0] to the second to last element
            for(j = i+1; j<= A.length-1; j++) { // j runs from i to last element

                // Compare the difference between A[i] and A[j] to their position in the array.
                // if any two elements lie on a common row or diagonal, terminate all iterations.
                if (Math.abs(A[i] - A[j]) == Math.abs((i - (j)))) {
                    i = A.length-2;
                    solution = false;
                    break;
                }
                else
                    solution = true;
            }
        }
        return solution;
    }
}

