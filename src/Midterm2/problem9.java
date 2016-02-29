package Midterm2;

/**
 * Write a Java class called Distance that encapsulates a single data field of type double representing a
   distance measured in Meters. Write a single constructor for the class that takes a double argument and
   copies its value to the data field. Write three access functions called getMeters(), getFeet() and
   getFurlongs() that return respectively: the value stored in the data field, the distance measured in feet
   and the distance measured in furlongs. (Google "feet per meter" and "furlongs per meter" to learn the
   relevant conversion factors.)
 */
public class problem9 {
    public static void main(String[] args) {
        Distance dist = new Distance(10);
        System.out.println("The value of 'dist' in the form of Distance class: " + dist);
        System.out.println("Get info of this value in 'meters': " + dist.getMeters());
        System.out.println(dist.getFeet());
        System.out.println(dist.getFurlongs());
        dist.getFeet();
        System.out.println(dist);

    }
}
// Distance class
class Distance{

    // Fields
    private double distance; // A distance in meters

    // Constructor
    Distance(double d){
        distance = d;
    }

    // Methods
    public double getMeters(){
        return distance;
    }
    public double getFurlongs(){
        return distance*0.00497096;
    }
    public double getFeet(){
        System.out.println(distance + " meters is " + distance*3.28084 + " feet.");
        return distance*3.28084;
    }
    public String toString(){  // without this the printed value is gibberish (see stdout: 1)
        return ""+distance;
    }
}