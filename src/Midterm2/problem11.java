package Midterm2;

/**
 * Write a function with the heading static void sortStringArray(String[] X) that sorts the
   elements of its String[] argument X in (increasing) alphabetical order. Thus if X is the array {one,
   two, three, four}, then a call to sortStringArray() on X will change it to {four, one,
   three, two}. Hint: follow one of the examples BubbleSort.java or SelectionSort.java
   discussed in class. To compare two Strings as to their alphabetic order, use function compareTo()
   belonging to the String class (in the library java.lang.)
 */
import java.util.*;
public class problem11 {
    public static void main(String[] args) {
        String[] ass = { "one", "two", "three", "four"};
        sortStringArray(ass);
        System.out.println(Arrays.toString(ass));

    }
    static void sortStringArray(String[] X){

        for(int i = X.length; i>1; i--){
            for(int j = 0; j<i-1; j++){
                if(X[j].compareTo(X[j+1])>0){
                    swap(X, j,j+1);
                }
            }
        }
        }
        static void swap(String[] Y, int a, int b ){
        String temp = Y[a];
        Y[a] = Y[b];
        Y[b] = temp;
    }


}
