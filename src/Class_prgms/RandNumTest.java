package Class_prgms;

/**
 * Created by Rick on 1/20/2016.
 */
public class RandNumTest {
    public static void main(String[] args) {
        int[] list = new int[10];

        for(int i = 0; i<100; i++){
            int rndNum = 1 + (int)(Math.random() * 10);
            System.out.print(" " + rndNum);
        }
    }
}
