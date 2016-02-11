/**
 * Created by Rick on 2/10/2016.
 */
import java.util.Arrays;
import java.util.Scanner;
public class pa4 {
    public static void main(String[] args) {
        double resolution = 10*Math.pow(10,-2), tolerance = 10*Math.pow(10,-7), threshold = 10*Math.pow(10,-3);
        int degree = 0;
        double[] c;
        double left, right;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the degree: ");
        degree = input.nextInt();
        c = new double[degree+1];

        System.out.print("Enter " + (degree + 1) + " coefficients: ");
        for(int i =0; i<degree+1; i++){
            c[i] = input.nextDouble();
        }
        System.out.print("Enter the left and right endpoints: ");
        left = input.nextDouble();
        right = input.nextDouble();
        resolution = left   - right;
        System.out.println(degree);
        System.out.println(Arrays.toString(c));
        System.out.println(left + "   " + right);
/*
        static double poly(double[] c, double x){
            for(int i=0 ; i<x; i++){
                c[i] = i;
            }

        }

        static double[] diff(double[] c){

        }

        static double findRoot(double[] C, double a, double b, double tolerance){

    }
*/
    }
}
