package practiceMidterm;

/**
 * Created by Rick on 1/31/2016.
 */
import java.util.Scanner;
public class Problem8_ALT {
    public static void main( String[] args ){
        int a=0,b=0,c=0,d=0,e=0, temp;
        boolean anInteger ;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter an integer: ");
            if(input.hasNextInt()) {
                a = input.nextInt();
                anInteger = true;
            }
            else{
                System.out.print("I don't understand. ");
                anInteger=false;
                input.next();
            }
        }while(!(anInteger));

        do{
            System.out.print("Enter an integer: ");
            if(input.hasNextInt()) {b = input.nextInt();anInteger = true;}
            else{System.out.print("I don't understand.");anInteger=false;input.next();}
        }while(!(anInteger));

        do{
            System.out.print("Enter an integer: ");
            if(input.hasNextInt()) {c = input.nextInt();anInteger = true;}
            else{System.out.print("I don't understand.");anInteger=false;input.next();}
        }while(!(anInteger));

        do{
            System.out.print("Enter an integer: ");
            if(input.hasNextInt()) {d = input.nextInt();anInteger = true;}
            else{System.out.print("I don't understand.");anInteger=false;input.next();}
        }while(!(anInteger));

        do{
            System.out.print("Enter an integer: ");
            if(input.hasNextInt()) {e = input.nextInt();anInteger = true;}
            else{System.out.print("I don't understand.");anInteger=false;input.next();}
        }while(!(anInteger));

        if (a > b) {temp = a;a = b;b = temp;}       // Once all input satisfied, sort
        if (b > c) {temp = b;b = c;c = temp;}
        if (c > d) {temp = c;c = d;d = temp;}
        if (d > e) {temp = d;d = e;e = temp;}

        if (a > b) {temp = a;a = b;b = temp;}
        if (b > c) {temp = b;b = c;c = temp;}
        if (c > d) {temp = c;c = d;d = temp;}

        if (a > b) {temp = a;a = b;b = temp;}
        if (b > c) {temp = b;b = c;c = temp;}

        if (a > b) {temp = a;a = b;b = temp;}
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);

    }
}
