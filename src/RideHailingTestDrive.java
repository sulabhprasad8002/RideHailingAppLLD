import java.util.Map;

public class RideHailingTestDrive {
    public static void main(String[] args) {
        //---------------Creating Riders and Drivers--------------------------------
        Rider joeyRider = new Rider("Joey", RATING.FIVE_STARS);
        Rider jackRider = new Rider("Jack", RATING.FIVE_STARS);
        RiderManager riderMgr = RiderManager.getRiderManager();
        riderMgr.addRider("Joey", joeyRider);
        riderMgr.addRider("Jack", jackRider);

        Driver sidDriver = new Driver("Sid", RATING.THREE_STARS);
        Driver zoyaDriver = new Driver("Zoya", RATING.FOUR_STARS);
        DriverManager driverMgr = DriverManager.getDriverManager();
        driverMgr.addDriver("Sid", sidDriver);
        driverMgr.addDriver("Zoya", zoyaDriver);

        //These details in turn will be stored in database
        //-------------------------------------------------------------------------

        TripManager tripManager = TripManager.getTripManager();


    System.out.println("Creating Trip for Joey from location (10,10) to (30,30)");
    tripManager.CreateTrip(joeyRider, new Location(10, 10), new Location(30, 30));

    System.out.println("Creating Trip for Jack from location (200,200) to (500,500)");
    tripManager.CreateTrip(jackRider, new Location(200, 200), new Location(500, 500));


    //-------------------Display all the trips created--------------------------
    Map<Integer, Trip> tripsMap = tripManager.getTripsMap();
    for (Trip trip : tripsMap.values()) {
        trip.displayTripDetails();
    }
}