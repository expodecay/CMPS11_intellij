package FinalReview;

/**
 * Created by Rick on 3/11/2016.
 *
 * Determine what is printed by the following Java program, which consists of two files: Place.java and PlaceTest.java.
 * Assume that both files are in the same directory.
 */
// Place.java
class Place{
    // Fields
    String name; double latitude; double longitude;
    // Constructor
    Place(String n, double lat, double lon){
        name = n;
        latitude = lat;
        longitude = lon;
    }
    public String toString(){
        return( name +": "+latitude+" N "+longitude+" W" );
    }
    boolean isFurtherWestThan(Place x){ return(this.longitude>x.longitude); }
    boolean isFurtherNorthThan(Place x){ return(this.latitude>x.latitude ); }
}
// PlaceTest.java
class PlaceTest{
    public static void main(String[] args){
        Place[] P = new Place[4];
        P[0] = new Place("Doriath", 33.1, 84.5);
        P[1] = new Place("Nargothrond", 39.8, 101.7);
        P[2] = new Place("Thangorodrim", 45.0, 73.3);
        P[3] = new Place("Gondolin", 40.6, 74.2);
        int i, n;
        for(n=P.length; n>1; n--)
            for(i=0; i<n-1; i++)
                if( P[i].isFurtherNorthThan(P[i+1]) ) swap(P, i, i+1);
        printPlaceArray(P);
    }
    static void swap(Place[] A, int i, int j){
        Place temp = A[i]; A[i] = A[j]; A[j] = temp;
    }
    static void printPlaceArray(Place[] A){
        for(int i=0; i<A.length; i++) System.out.println(A[i]);
    }
}