package Midterm2;

/**
 * Determine the output of the following Java program. Notice that the method fcn2() is overloaded, so
   there are really three distinct functions here.
 */
class Problem1{
    public static void main( String[] args ){
        int a=5, b=3, c;
        double x=2.2, y=1.3, z;
        c = fcn1(a, b);
        b = fcn2(x, y);
        z = fcn2(c, b);
        System.out.println("a="+a+", b="+b+", c="+c);
        System.out.println("x="+x+", y="+y+", z="+z);
        System.out.println("bye!");
    }
    static int fcn1(int i, int j){
        int k = (i++) + (++j);    // There is no operation between i++ and a new value of k, so i++ remains 5 upon return.
        //k += ++i;                //This will allow the previous i++ to complete giving 5+4+(i = 6). Total returns 17
        return k+2;    // Same as k = i++) + (++j) + 2 and returning k.
    }
    static int fcn2(double u, double v){
        return fcn1((int)(u+v), 3);
    }
    static double fcn2(int r, int s){
        return (double)fcn1(r+s, 3);
    }
}
/*
*  c = fcn1(5,3)
*       k = 5++ + ++3 = 5+4 = 9
*           k+2 = 9 + 2 = 11                                       c = 11
*
*
*  b = fcn2(2.2, 1.3)       // Use double overload (returns int) //
*      fcn1((int)(2.2+1.3) , 3) = fcn1((int)3.5 , 3) = fcn1(3,3)
*          k = 3++ + ++3 = 3 + 4 = 7
*              k+2 = 7 + 2 = 9                                     b = 9
*
*
*  z = fcn2(11, 9)      // Use int overload (returns double)//
*     (double)fcn1(11+9 , 3) = (double)fcn1(20, 3)
*           k = 20++ + ++3 = 20 + 4 = 24
*               k+2 = 26
*                   (double)26 = 26.0                              z = 26.0
* */