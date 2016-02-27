package Midterm2;

/**
 * Write a function with the heading static void printStringArray(String[] X) that prints out
   the elements of its String[] argument X to stdout in reverse order, each on a separate line. In other
   words if X is the array {one, two, three}, then the output will be:
        three
        two
        one
 */
public class problem10 {
    public static void main(String[] args) {
        String[] words = {"one", "two", "three"};
        printStringArray(words);
    }

    static void printStringArray(String[] X){
        for(int i = X.length-1; i>=0; i--){
            System.out.println(X[i]);
        }
    }
}
