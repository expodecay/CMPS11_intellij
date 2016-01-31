package practiceMidterm;

/**
 * Created by Rick on 1/30/2016.
 *
 * PERFORMS AND PRINTS CALCULATION
 */
import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double x, y, z;
        System.out.print("Enter three integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.print("Enter three doubles: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        a = (++c)-(b++);
        x += (z - y);
        b *= b;
        y = c*z;
        c = (int)(b - x);
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
        System.out.println("c/a=" + c/a);
        System.out.println("c%a=" + c%a);
    }

}
/*
SAMPLE INPUT:

 Enter three integers: 1 3 5
 Enter three doubles: 1.5 2.0 2.5

 SAMPLE OUTPUT:
 a=3, b=16, c=14
 x=2.0, y=15.0, z=2.5
 c/a=4
 c%a=2
*
* */