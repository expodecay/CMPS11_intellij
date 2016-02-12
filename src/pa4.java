/**
 * Created by Rick on 2/10/2016.
 */

import java.util.Scanner;
public class pa4 {
    public static void main(String[] args) {
        // Tolerance = epsilon
        // resolution = width of sub interval
        // threshold => upper limit for F(evenRoot) = 0
        double resolution = Math.pow(10,-2), tolerance = Math.pow(10,-7), threshold = Math.pow(10,-3);
        int degree;
        double[] c;
        double left, right, a, b;

        // Prompt user for degree of polynomial.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the degree: ");
        degree = input.nextInt();
        c = new double[degree+1];

        // Populate coefficient matrix
        System.out.print("Enter " + (degree + 1) + " coefficients: ");
        for(int i =0; i < degree+1; i++){
            c[i] = input.nextDouble();
        }

        // Prompt user for endpoints
        System.out.print("Enter the left and right endpoints: ");
        left = input.nextDouble();
        right = input.nextDouble();

        /*  Main Loop:   Same logic as findRoot() */
        a = left;
        int i = 0; // Keep track of number of zeros found.
        b = a + resolution;

        // Loop over sub intervals.
        while(a < right){
            if(poly(c,a) * poly(c,b) <= 0) {  // If function changes sign in sub-interval, find root.
                double root = findRoot(c, a, b, tolerance);
                System.out.print("Root found at ");
                System.out.printf("%.5f%n", root);  // Print root to within 5 decimal places.
                i++;
            }
            else if(poly(diff(c),a) * poly(diff(c), b) <= 0){  // If F'(x) changes sign, find even root.
                double root = findRoot(diff(c), a, b, tolerance);
                if(Math.abs(poly(c,root)) < threshold){  // Make sure even root is zero in F(x).
                    System.out.print("Root found at ");
                    System.out.printf("%.5f%n",root);
                    i++;
                }
            }
            a = b;                  // Shift to next sub interval
            b = a + resolution;     //
        }
        if(i == 0) {
            System.out.println("No roots were found in the specified range");
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

    // Calculate derivative array.
    static double[] diff(double[] c){
        double[] d = new double[c.length-1];
        for(int i = 0; i<d.length; i++){
            d[i] = (i+1) * c[i+1];
        }
        return d;
    }

    // Zero finder
    static double findRoot(double[] C, double a, double b, double tolerance){
        double left=0, right=0, root =0;
        left = a;
        right = left + tolerance;
        while(left < b) {
            if (poly(C, left) * poly(C, right) < 0) {
                root = (right + left) / 2;  // If F(x) changes sign, take midpoint of interval as root.
            }
            left = right;
            right = left + tolerance;
        }
        return root;
    }

}
