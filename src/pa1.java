/**
 * pa1.java
 * Rick Ramirez
 * riryrami
 * Lawn
 * This program asks the user for input from the keyboard, then performs a calculation and prints the results.
 */

import java.util.Scanner; // import class ... Scanner is in the java.util package
public class pa1 {
    public static void main(String[] args) {

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the dimensions of the lot.
        System.out.print("Enter the length and width of the lot, in feet: ");
        double lotLength = input.nextDouble();
        double lotWidth = input.nextDouble();

        // Prompt user to enter the dimensions of the house.
        System.out.print("Enter the length and width of the house, in feet: ");
        double houseLength = input.nextDouble();
        double houseWidth = input.nextDouble();

        // Calculate and print the area of the lawn.
        double area = lotLength * lotWidth - houseLength * houseWidth;
        System.out.println("The lawn area is " + area + " square feet.");

        // Prompt user for rate at which lawn is mowed.
        System.out.print("Enter the mowing rate, in square feet per second: ");
        double mowRate = input.nextDouble();

        // Determine the hours, minutes and seconds required to mow the lawn.
        int seconds = (int)Math.round(area / mowRate);
        int minutes = seconds / 60;
        int hours = minutes / 60;
        minutes = minutes % 60;
        seconds = seconds % 60;

        // The output is arranged such that plural and singular time components are printed accordingly.
        System.out.println("The mowing time is " + hours + " hour" + (hours==1? " ":"s ") + minutes
                + " minute" + (minutes==1? " ":"s ") + seconds + " second" + (seconds==1? "":"s")+".");

    }
}
