package FinalReview;

/**
 * Created by Rick on 3/16/2016.
 */
import java.util.Scanner;
import java.io.*;
class Problem7{
    public static void main(String[] args){
        Scanner sc = null;
        double sum;
        int count = 1;

        if(args.length!=1){
            System.out.println("Usage: java Problem7 filename");
            System.exit(1);
        }
        try{
            sc = new Scanner(new File(args[0]));
        }catch(FileNotFoundException e){
            System.err.println(e.getMessage());
            System.exit(1);
        }

        sum = sc.nextDouble();
        while(sc.hasNextDouble()){
            sum += sc.nextDouble();
            count++;
        }
        System.out.println(
                "The average value in file " + args[0] + " is " + sum/count
        );
        sc.close();
    }
}
