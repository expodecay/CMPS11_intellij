package FinalReview;

public class Problem11 {
}
class DownCounterTest{
    public static void main( String[] args ){
        DownCounter a = new DownCounter(5);
        DownCounter b = new DownCounter(7);
        for(int i=0; i<11; i++){
            System.out.println(a+" "+b);
            a.click();
            b.click();
        }
        System.out.println(a+" "+b);
        clickAndShow(a);
        resetAndShow(a);
    }
    // clickAndShow()
    // calls click() then prints c
    static void clickAndShow( AbstractCounter c ){
        c.click();
        System.out.println(c);
    }

    // resetAndShow()
    // calls reset() then prints c
    static void resetAndShow( AbstractCounter c ){
        c.reset();
        System.out.println(c);
    }
}
abstract class AbstractCounter{

    // Member variables
    protected int value;  // try making either of these fields private
    protected int limit;  // instead of protected, see what happens

    // Abstract methods
    abstract void click();

    // Defined methods
    void reset(){ value = 0;}
    int getValue(){ return value; }
    public String toString(){ return String.valueOf(value); }
}

class DownCounter extends AbstractCounter{
    DownCounter(int limit){
        this.limit = limit;
        this.value = limit;
    }
    void click(){
       // System.out.println("value::  " + this.value);
        value -= 1;
        if(this.value == 0){
            this.reset();
        }
    }
    void reset(){
        value = limit;
    }
}