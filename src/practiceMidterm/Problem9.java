package practiceMidterm;

/**
 * Created by Rick on 1/30/2016.
 */
public class Problem9 {
    static int square(int n){
        n = (int)Math.pow(n,2);
        return n;
    }

    static int cube(int n){
        n = (int)Math.pow(n,3);
        return n;
    }

    static int quartic(int n){
        n = square(n)*square(n);
        return n;
    }

    static int quintic(int n){
        n = square(n)*cube(n);
        return n;
    }
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Integer", "Square", "Cube", "Quartic", "Quintic");
        System.out.println("-----------------------------------------------");
        for (int i = 1; i<=25; i++){
            System.out.format("%-10s%-10s%-10s%-10s%-10s\n" ,i  , square(i) , cube(i) , quartic(i)  ,quintic(i));
            System.out.printf("");
        }
    }
}
/*
        SAMPLE OUTPUT

Integer   Square    Cube      Quartic   Quintic
-----------------------------------------------
1         1         1         1         1
2         4         8         16        32
3         9         27        81        243
4         16        64        256       1024
5         25        125       625       3125
6         36        216       1296      7776
7         49        343       2401      16807
8         64        512       4096      32768
9         81        729       6561      59049
10        100       1000      10000     100000
11        121       1331      14641     161051
12        144       1728      20736     248832
13        169       2197      28561     371293
14        196       2744      38416     537824
15        225       3375      50625     759375
16        256       4096      65536     1048576
17        289       4913      83521     1419857
18        324       5832      104976    1889568
19        361       6859      130321    2476099
20        400       8000      160000    3200000
21        441       9261      194481    4084101
22        484       10648     234256    5153632
23        529       12167     279841    6436343
24        576       13824     331776    7962624
25        625       15625     390625    9765625
* */
