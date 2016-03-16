/**
 * Created by Rick on 3/8/2016.
 */
//-----------------------------------------------------------------------------
// Complex.java
// Represents complex numbers as a pair of doubles
//
// pa6
// Fill in the function definitions below. See notes from 3-2-16 for the
// definitions of the complex arithmetic operations.
//-----------------------------------------------------------------------------
class Complex{
    public static void main(String[] args) {
        Complex ass = new Complex(2,3);
        Complex bitch = new Complex(-4,-5);
        Complex cock = new Complex("i");
        Complex tits = new Complex(-8,-9);
        System.out.println(ass.sub(bitch));
        System.out.println(valueOf(cock.im));
    }

    //--------------------------------------------------------------------------
    // Private Data Fields
    //--------------------------------------------------------------------------
    private double re;
    private double im;

    //--------------------------------------------------------------------------
    // Public Constant Fields
    //--------------------------------------------------------------------------
    public static final Complex ONE = Complex.valueOf(1,0);
    public static final Complex ZERO = Complex.valueOf(0,0);
    public static final Complex I = Complex.valueOf(0,1);

    //--------------------------------------------------------------------------
    // Constructors
    //--------------------------------------------------------------------------
    Complex(double a, double b){
        this.re = a;
        this.im = b;
    }

    Complex(double a){
        this.re = a;
        this.im = 0;
    }

    Complex(String s){
        // Fill in this constructor.
        // It should accept expressions like "-2+3i", "2-3i", "3", "5i", etc..
        // Throw a NumberFormatException if s cannot be parsed as Complex.
        double[] c = parseComplex(s);
        this.re = c[0];
        this.im = c[1];
    }

    //---------------------------------------------------------------------------
    // Public methods
    //---------------------------------------------------------------------------

    // Complex arithmetic -------------------------------------------------------

    // copy()
    // Return a new Complex equal to this Complex
    Complex copy(){
        return new Complex(this.re, this.im);
    }

    // add()
    // Return a new Complex representing the sum this plus z.
    Complex add(Complex z){
        Complex w = this;
        double real = w.re + z.re;
        double imag = w.im + z.im;
        return new Complex(real, imag);
    }

    // negate()
    // Return a new Complex representing the negative of this.
    Complex negate(){
        return new Complex(-this.re,-this.im);
    }

    // sub()
    // Return a new Complex representing the difference this minus z.
    Complex sub(Complex z){
        Complex w = this;
        double real = w.re - z.re;
        double imag = w.im - z.im;
        return new Complex(real, imag);
    }

    // mult()
    // Return a new Complex representing the product this times z.
    Complex mult(Complex z){
        Complex w = new Complex(0,0);
        w.re = z.re*this.re - z.im*this.im;
        w.im = z.re*this.im + z.im*this.re;

        return new Complex(w.re, w.im);
    }

    // recip()
    // Return a new Complex representing the reciprocal of this.
    // Throw an ArithmeticException with appropriate message if
    // this.equals(Complex.ZERO).
    Complex recip(){
        if(this.equals(Complex.ZERO)){
            throw new ArithmeticException("Division by Zero error");
        }
        double scale = re*re + im*im;
        return new Complex(re / scale, -im / scale);
    }

    // div()
    // Return a new Complex representing the quotient of this by z.
    // Throw an ArithmeticException with appropriate message if
    // z.equals(Complex.ZERO).
    Complex div(Complex z){
        if(z.equals(Complex.ZERO)){
            throw new ArithmeticException("Division by Zero error");
        }
        Complex w = new Complex(0,0);
        double denominator = z.re*z.re + z.im*z.im;
        w.re = this.re * z.re + this.im * z.im;
        w.im = z.re * this.im - z.im * this.re;
        return new Complex(w.re/denominator, w.im/denominator);
    }


    // conj()
    // Return a new Complex representing the conjugate of this Complex.
    Complex conj(){
        return new Complex(re, -im);
    }

    // Re()
    // Return the real part of this.
    double Re(){
        return re;
    }

    // Im()
    // Return the imaginary part of this.
    double Im(){
        return im;
    }

    // abs()
    // Return the modulus of this Complex, i.e. the distance between
    // points (0, 0) and (re, im).
    double abs(){
        return Math.hypot(re, im);
    }

    // arg()
    // Return the argument of this Complex, i.e. the angle this Complex
    // makes with positive real axis.
    double arg(){
        return Math.atan2(im, re);
    }

    // Other functions ---------------------------------------------------------

    // toString()
    // Return a String representation of this Complex.
    // The String returned will be readable by the constructor Complex(String s)
    public String toString(){
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im <  0) return re + "-" + (-im) + "i";
        return re + "+" + im + "i";
    }

    // equals()
    // Return true iff this and obj have the same real and imaginary parts.
    public boolean equals(Object obj){
        boolean eq = false;
        Complex w;
        if (obj instanceof Complex){
            w = (Complex)obj;
            if(this.re==w.re && this.im==w.im){
                eq = true;
            }
        }
        if(!(obj instanceof Complex)){
            System.out.println(obj +" is not an instance of Complex.");
        }
        return eq;
    }

    // valueOf()
    // Return a new Complex with real part a and imaginary part b.
    static Complex valueOf(double a, double b){
        return new Complex(a,b);
    }

    // valueOf()
    // Return a new Complex with real part a and imaginary part 0.
    static Complex valueOf(double a){
        return new Complex(a);
    }

    // valueOf()
    // Return a new Complex constructed from s.
    static Complex valueOf(String s){
        double[] c = parseComplex(s);
        return new Complex(c[0], c[1]);
    }

    static double[] parseComplex(String str){
        double[] part = new double[2];
        String s = str.trim();
        String NUM = "(\\d+\\.\\d*|\\.?\\d+)";
        String SGN = "[+-]?";
        String OP =  "\\s*[+-]\\s*";
        String I =   "i";
        String OR =  "|";
        String REAL = SGN+NUM;
        String IMAG = SGN+NUM+"?"+I;
        String COMP = REAL+OR+
                IMAG+OR+
                REAL+OP+NUM+"?"+I;

        if( !s.matches(COMP) ){
            throw new NumberFormatException(
                    "Cannot parse input string \""+s+"\" as Complex");
        }
        s = s.replaceAll("\\s","");
        if( s.matches(REAL) ){
            part[0] = Double.parseDouble(s);
            part[1] = 0;
        }else if( s.matches(SGN+I) ){
            part[0] = 0;
            part[1] = Double.parseDouble( s.replace( I, "1.0" ) );
        }else if( s.matches(IMAG) ){
            part[0] = 0;
            part[1] = Double.parseDouble( s.replace( I , "" ) );
        }else if( s.matches(REAL+OP+I) ){
            part[0] = Double.parseDouble( s.replaceAll( "("+REAL+")"+OP+".+" , "$1" ) );
            part[1] = Double.parseDouble( s.replaceAll( ".+("+OP+")"+I , "$1"+"1.0" ) );
        }else{   //  s.matches(REAL+OP+NUM+I)
            part[0] = Double.parseDouble( s.replaceAll( "("+REAL+").+"  , "$1" ) );
            part[1] = Double.parseDouble( s.replaceAll( ".+("+OP+NUM+")"+I , "$1" ) );
        }
        return part;
    }


}


