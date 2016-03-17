package FinalReview;

/**
 * Created by Rick on 3/16/2016.
 */
public class Problem10 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("usage: ");
            System.exit(1);
        }
        int n=0;
        try{
            n = Integer.parseInt(args[0]);
        }catch (java.util.InputMismatchException e){
            System.out.println("no no no");

            System.exit(1);
        }
        if(n<2){
            System.out.println("Usage: java DrawSquare <positive integer at least 2>");
            System.exit(1);
        }

        String matrix[][] = new String[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==0 | j ==0 | j== n-1 | i==n-1){
                    matrix[i][j]= "*";
                }
                else
                    matrix[i][j] = " ";
            }

        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

}
/*
* int height = 3, width = 3;
        String str = "ass";

        for (int y=0; y<height; y++) {
            for (int x=0; x<width; x++) {
                if (x > 0) System.out.println(" ");
                System.out.print(str + " ");
            }
            System.out.println();
        }
* */