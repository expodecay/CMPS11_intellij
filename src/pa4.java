/**
 * Created by Rick on 2/10/2016.
 */

import java.util.Scanner;
public class pa4 {
    public static void main(String[] args) {
        // Tolerance = epsilon
        // resolution = width of sub interval
        // threshold => upper limit for F(evenRoot) = 0 (needed to compensate rounding errors.)
        double resolution = Math.pow(10,-2), tolerance = Math.pow(10,-7), threshold = Math.pow(10,-3);
        int degree;
        double[] c;
        double left, right, a, b;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the degree: ");
        degree = input.nextInt();
        c = new double[degree+1];

        // Populate coefficient matrix
        System.out.print("Enter " + (degree + 1) + " coefficients: ");
        for(int i =0; i < degree+1; i++){
            c[i] = input.nextDouble();
        }
        System.out.print("Enter the left and right endpoints: ");
        left = input.nextDouble();
        right = input.nextDouble();
/*********************************************************/
        // Main loop
        a = left;
        b = a + resolution;
        while(a < right){
            if(poly(c,a) * poly(c,b) <= 0) {
                double root = findRoot(c, a, b, tolerance);
                System.out.printf("%.5f%n", root);
            }
            else if(poly(diff(c),a) * poly(diff(c), b) <= 0){
                double root = findRoot(diff(c), a, b, tolerance);
                if(Math.abs(poly(c,root)) < threshold){
                    System.out.printf("%.5f%n",root);
                }
            }
            a = b;
            b = a + resolution;
        }

    }
    // Return the value of F(x)
    //c_0 + c_1 x^1 + c_2 x^2 + ... + c_n x^n
    static double poly(double[] c, double x){
        double sum = 0.0;
        for(int i=0 ; i < c.length ; i++){
            sum += c[i] * Math.pow(x,i);
        }
        return sum;
    }

    static double[] diff(double[] c){
        double[] d = new double[c.length-1];
        for(int i = 0; i<d.length; i++){
            d[i] = (i+1) * c[i+1];
        }
        return d;
    }

    static double findRoot(double[] C, double a, double b, double tolerance){
        double root = 0.0 , residual;
        while ( b - a > tolerance ) {
            root = (a + b) / 2.0;
            residual = poly(C, root);
            if (residual > 0)
                b = root; // replace right endpoint
            else
                a = root; // replace left endpoint

        }
        return root;

    }
}
