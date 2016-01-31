package practiceMidterm;

/**
 * Created by Rick on 1/30/2016.
 */
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {

        double x,y,z;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two doubles: ");
        x = input.nextDouble();
        y = input.nextDouble();

        z = Math.sqrt(x) + Math.sqrt(y);

        System.out.println(z);
    }
}
