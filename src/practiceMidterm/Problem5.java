package practiceMidterm;

/**
 * Created by Rick on 1/30/2016.
 *
 * CALCULATES AVERAGE, DETERMINES IF A LIST OF NUMBERS IS IN ASCENDING ORDER.
 */
public class Problem5 {

    static int sum(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a += i;
        }
        return a;
    }

    static double avg(int n) {
        double b;                      // MAKE SURE YOU USE A GOD DAMN DOUBLE!!!
        double  a = sum(n);            // FOR BOTH OF THESE
        b = a / n;
        return b;
    }

    static boolean ord(double x, double y, double z){
        if(x<y){
            if(y<z){
                return true;
            }
        }
        return false;   // NEED THIS HERE, MUST BE FALSE ELSE EVERYTHING RETURNS TRUE.
    }

    public static void main(String[] args) {
        System.out.println(avg(12));
        System.out.println(ord(1.2, 3.4, 5.6));
        System.out.println(ord(3.4, 1.2, 5.6));
        System.out.println(ord(4,3,2));
    }
}
/*
* SAMPLE OUTPUT:
*
*   6.5
*   true
*   false
*
* */
