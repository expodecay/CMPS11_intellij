package FinalReview;

/**
 * Created by Rick on 3/15/2016.
 */
// RationalTest.java
class RationalTest{
    public static void main(String[] args){
        String str;
        Rational x = new Rational(7, 5);
        Rational y = new Rational(13, 3);
        Rational z = new Rational(28, 20);
        System.out.println(x +"+"+ y +" = "+ x.plus(y) );

        System.out.println(x +"*"+ y +" = "+ x.times(y) );
        System.out.println(x +"*("+ y +"+"+ z +") = "+ x.times(y.plus(z)));
        str = (x.equals(y)?" is equal to ":" is not equal to ");
        System.out.println(x + str + y);
        str = (x.equals(z)?" is equal to ":" is not equal to ");
        System.out.println(x + str + z);
    }
}
// Rational.java
class Rational{
    int numerator; int denominator; // Fields
    Rational(int n, int d){ // Constructor
        if(d==0) throw new RuntimeException("zero denominator");
        numerator = n; denominator = d;
    }
    Rational plus(Rational Q){
        int num1 = this.numerator*Q.denominator + Q.numerator * this.denominator;
        int den = this.denominator*Q.denominator;
        return new Rational(num1,den);
    }
    Rational times(Rational Q){
        int num = this.numerator * Q.numerator;
        int den = this.denominator * Q.denominator;
        return new Rational(num,den);
    }
    public String toString(){
        return numerator + "/" + denominator;
    }
    public boolean equals(Object x){
        Boolean eq = false;
        Rational check = new Rational(0,1);    // Must initialize and must have denominator > 1
        if(x instanceof Rational) {
            check = (Rational) x;
        }
        if(this.numerator==check.numerator && this.denominator==check.denominator){
            eq = true;
        }
        return eq;
    }
} // end of class Rational
