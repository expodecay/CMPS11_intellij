/**
 * Created by Rick on 2/10/2016.
 */
import java.util.Arrays;
import java.util.Scanner;
public class pa4 {
    public static void main(String[] args) {
        // Tolerance = epsilon
        // resolution = width of sub interval
        // threshold => upper limit for F(evenRoot) = 0 (needed to compensate rounding errors.)
        double resolution = 10*Math.pow(10,-2), tolerance = 10*Math.pow(10,-7), threshold = 10*Math.pow(10,-3);
        int degree = 0;
        double[] c;
        double left, right;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the degree: ");
        degree = input.nextInt();
        c = new double[degree+1];

        // Populate coefficient matrix
        System.out.print("Enter " + (degree + 1) + " coefficients: ");
        for(int i =0; i<degree+1; i++){
            c[i] = input.nextDouble();
        }
        // Populate derivative coefficient matrix
        double[] derivative = diff(c);
        System.out.print("Enter the left and right endpoints: ");
        left = input.nextDouble();
        right = input.nextDouble();
        resolution = left   - right;
        System.out.println(degree);

        System.out.println(Arrays.toString(c));
        System.out.println(left + "   " + right);

        double value = 2;
        double ass = poly(c,value);


        System.out.println("value at f(a): " + ass);
        System.out.println("Deriv of coefficients: " + Arrays.toString(derivative));
        System.out.println(Arrays.toString(c));
    }
    // Return the value of F(x)
    //c_0 + c_1 x^1 + c_2 x^2 + ... + c_n x^n
    static double poly(double[] c, double x){
        double sum = 0;
        for(int i=0 ; i<x + 1; i++){
            c[i] *= Math.pow(x,i);
            sum += c[i];
        }
        return sum;
    }

    static double[] diff(double[] c){
        double[] d = new double[c.length-1];

        for(int i = 0; i<d.length; i++){
            d[i] = c[i];
        }
        return d;
    }
/*
    static double findRoot(double[] C, double a, double b, double tolerance){

    }
    */
}
