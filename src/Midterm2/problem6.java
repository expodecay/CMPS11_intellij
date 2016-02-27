package Midterm2;

/**
 * Determine the output of the following Java program. This program consists of two files Blah.java and
   BlahTest.java defining the classes Blah and BlahTest respectively.
 */
class Blah{
    private int foo;
    private double bar;

    Blah(int f, double b){
        foo = f;
        bar = b;
    }
    Blah(int a, int b){
        foo = a+b;
        bar = 0.0;
    }
    int getFoo(){
        return foo;
    }
    void setBar(double x){
        bar = x;
    }
    void mult(){
        bar *= foo;
    }
    public String toString(){
        return "("+foo+", "+bar+")";
    }

    // Determines if input is of Blah type, then compares with another object of Blah type.
    public boolean equals(Object x){  // equals() takes object as parameter
        boolean eq = false;
        Blah B;                       // Create an object of the Blah class
        if( x instanceof Blah ){      // Cast x to Blah and assign to variable B.
            B = (Blah)x;
            eq = (foo==B.foo && bar==B.bar); // foo and bar refer to A.    B.foo and B.bar refer to B
            System.out.println("foo: "+foo);
            System.out.println("B.foo: " + B.foo);
        }
        return eq;
    }
}
// BlahTest.java main()
class BlahTest{
    public static void main(String[] args){
        Blah A = new Blah(15, 3.0);
        Blah B = new Blah(7, 8);  // B is an instance of the Blah class
        System.out.println(A);
        System.out.println(B);
        A.mult();
        B.setBar(45.0);
        int b = 6;
        System.out.println(A.equals(b));
        System.out.println(A.equals(B));
    }
}