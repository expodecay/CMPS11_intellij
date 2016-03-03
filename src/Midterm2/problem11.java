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
        String[] ass = { "bat","one", "two", "three", "four", "beaver","cat","four", "spider"};
        sortStringArray(ass);
        System.out.println(Arrays.toString(ass));

    }
    static void sortStringArray(String[] X){

        for(int i = X.length-1; i>0; i--){  // traverse list from right to left
            for(int j = 0; j < i-1; j++){    // take left element and (up to last element in list)
                if(X[j].compareTo(X[j+1])>0){ // compare that element with right hand neighbor ((-) implies argument should come before)
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
/*
* list = {"one", "two", "three", "four"}
*
* i = 4 ----> j ends at 3 (non-inclusive)
*
*   j = 0 compare j=1
*       one.compareTo(two) -> +1
*
*   j = 1 compare j = 2
*       two.compareTo(three) -> -1
*           swap(two and three)
*               list = {"one", "three","two", "four"}
*
*   j = 2 compare j = 3
*       two.compareTo(four) -> -1
*           swap(two and four)
*               list = {"one", "three", "four","two"}
*
* i = 3 ----> j ends at 2 (non-inclusive)
*
*   j = 0
*       one.compareTo(three) -> +1
*
*   j = 1
*       three.compareTo(four) -> -1
*           swap(three and four)
*               list = {"one", "four", "three", "two"}
*
*i = 2 ---> j ends at 1 (non-inclusive)
*
*   j = 0
*       one.compareTo(four) -> -1
*           swap(one and four)
*               list = {"four", "three", "two", "one"}
*
* i = 1 ---> break
*
* */
