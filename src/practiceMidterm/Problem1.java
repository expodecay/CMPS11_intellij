package practiceMidterm;

/**
 * Created by Rick on 1/30/2016.
 *
 * PERFORMS CALCULATION
 */
import java.util.Scanner;
public class Problem1 {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        int i, x, y, a, c=0, s=0;
        i = sc.nextInt();
        x = y = i;
        while( i!=0 ){
            if( i<x ) x = i;
            if( i>y ) y = i;
            s += i;
            c++;
            i = sc.nextInt();
        }
        a = s/c;
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
    }
}
/*
* SAMPLE INPUT: 5 3 9 7 0
*
* SAMPLE OUTPUT:
*   3
*   6
*   9
*
* Note that the iteration STOPS when i=0
* */