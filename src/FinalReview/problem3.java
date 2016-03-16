package FinalReview;

/**
 * Created by Rick on 3/11/2016.
 *
 * Determine the output of the following Java program. Assume that the program is run four times with the
 command line arguments file1, file2, file3, and file4, and assume that these files contain the following
 characters:
                file1: zero 3 2 4 17 5 8 9 16 13 28 77 12
                file2: one 4 3 72 0 9 2 17 5 19 50 8 91 14
                file3: two 5 3 9 2 18 27 45 66 91 92 93
                file4: blah 2 0 1 14 101 83 17 74 6 89 234
 Print the program output only, do not print the Unix commands that invoke the program
 */
// Problem3.java
import java.util.Scanner;
import java.io.*;
class Problem3{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(args[0]));
        String str = sc.next();
        int n;
        while(sc.hasNextInt()){
            n = sc.nextInt();
            if ( str.equals("zero") && n%3==0 ) System.out.print(n + " ");
            else if( str.equals("one") && n%3==1 ) System.out.print(n + " ");
            else if( str.equals("two") && n%3==2 ) System.out.print(n + " ");
            else continue;
        }
        System.out.println("end of " + str + "s");
    }
}

/*
*               STDOUT
*
*  3 9 12 end of zeros
*
*  4 19 91 end of ones
*
*  5 2 92 end of twos
*
*  end of blahs
* */