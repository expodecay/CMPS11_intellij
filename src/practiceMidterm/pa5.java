package practiceMidterm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rick on 2/28/2016.
 */
public class pa5 {
    public static void main(String[] args) {
        /* Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        int[] array =  initialize(n);
        int m = numIterations(n);
        print(array);
        for(int i = 0; i< m-1; i++){
            next_permutation(array);
            print(array);
        }*/
        int[] a = { 2, 4, 6, 8, 3,1, 7, 5};
        int[] b = {2,4,1,5,3};
        boolean solution1 = isSolutions(a);
        boolean solution2 = isSolutions(b);
        System.out.println("solution1 :" + solution1);
        System.out.println(solution2);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        int[] array =  initialize(n);
        int m = numIterations(n);
        for(int i = 0; i<= m-1; i++){
            if(i==0){
                if(isSolution(array))
                    print(array);
            }
            next_permutation(array);
            if(isSolution(array))
                print(array);
        }
    }
    static boolean isSolutions(int[] A){
        boolean solution = false;
        for(int i = 0; i < A.length; i++) {
            for(int j = i+1; j < i; j++){
                System.out.println((A[i] - A[j]));
                System.out.println(i-j);
                if (Math.abs((A[i] - A[j])) == Math.abs(i-j)) {
                    solution = false;
                }
                else
                    solution = true;
            }
        }
        return solution;
    }

    static int[] initialize(int n){
        int[] a  = new int[n];
        for (int i = 0; i <n; i++)
            a[i] = i+1;
        return a;
    }
    static int numIterations(int n){
        if(n == 1){
            return 1;
        }
        else
            return numIterations(n-1)*n;
    }

    public static void print(int[] array) {
        for (int tmp : array) {
            System.out.print(" " + tmp);
        }
        System.out.println();
    }

    public static void next_permutation(int[] array) {
        int i, j;
        // Find the largest index k such that a[k] < a[k + 1]. If no such index
        // exists, the permutation is the last permutation.
        for (i = array.length - 2; i >= 0; i--) {
            if (array[i] < array[i + 1])
                break;
        }
        if (i < 0) {
            return;
        }

        // Find the largest index l such that a[k] < a[l]. Since k + 1 is such
        // an index, l is well defined and satisfies k < l.
        for (j = array.length - 1; j > i; j--) {
            if (array[j] > array[i])
                break;
        }

        // Swap a[k] with a[l].
        swap(array, i++, j);

        // Reverse the sequence from a[k + 1] up to and including the final
        // element a[n].
        for (j = array.length - 1; j > i; i++, j--) {
            swap(array, i, j);
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
        for (i = 0; i <= A.length-2; i++) {
            // System.out.println("i: "+i);
            for(j = i+1; j<= A.length-1; j++) {
                // System.out.println("j:" +j);

                // System.out.println(Math.abs(A[i] - A[j]) == Math.abs((i - (j))));

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
/*
*boolean solution = false;
        for(int i = 0; i< A.length-1; i++) {
            if (Math.abs((A[i] - A[i + 1])) == Math.abs(i - (i + 1))) {
                solution = false;
                break;
            } else
                solution = true;
        }
        return solution;
* */