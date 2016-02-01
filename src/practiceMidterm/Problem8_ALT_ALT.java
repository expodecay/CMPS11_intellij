package practiceMidterm;

import java.util.Scanner;

/**
 * Created by Rick on 2/1/2016.
 */
public class Problem8_ALT_ALT {
    public static void main(String[] args) {
        int a=0, b=0, c=0, temp;
        Scanner input = new Scanner(System.in);

        for (int i =0; i<3; i++){
            if(i == 0) {
                System.out.print("Enter num1: ");
                while(true) {
                    if (!input.hasNextInt()) {
                        System.out.println("That's not an integer.");
                        input.next();
                    } else {
                        a = input.nextInt();
                        break;
                    }
                }
            }
            if(i ==1){
                System.out.println("Enter num2: ");
                while(true) {
                    if (!input.hasNextInt()) {
                        System.out.println("That's not an integer.");
                        input.next();
                    } else {
                        b = input.nextInt();
                        break;
                    }
                }
            }
            if(i == 2){
                System.out.println("Enter num3: ");
                while(true) {
                    if (!input.hasNextInt()) {
                        System.out.println("That's not an integer.");
                        input.next();
                    } else {
                        c = input.nextInt();
                        break;
                    }
                }
            }
        }
        if (a > b) {temp = a;a = b;b = temp;}       // Once all input satisfied, sort
        if (b > c) {temp = b;b = c;c = temp;}

        if (a > b) {temp = a;a = b;b = temp;}

        System.out.println(a + " " + b + " " + c );
    }
}
