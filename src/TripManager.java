import java.util.Map;

public class TripManager {
    private TripManager() {
        this.driverMgr = DriverManager.getDriverManager();
        this.riderMgr = RiderManager.getRiderManager();
    };

    static volatile TripManager tripManager;

    RiderManager riderMgr;
    DriverManager driverMgr;
    Map<Integer, TripMetadata> tripsMetaDataInfo;
    Map<Integer, Trip> tripsInfo;

    static TripManager getTripManager() {
        if(tripManager == null) {
            synchronized (TripManager.class) {
                if(tripManager == null) {
                    tripManager = new TripManager();
                }
            }
        }

        return tripManager;
    }
    void CreateTrip(Rider rider, Location srcLoc, Location dstLoc) {

        TripMetadata metaData = new TripMetadata(srcLoc, dstLoc, rider.getRating());
        StrategyManager strategyMgr = StrategyManager.getStrategyManager();
        PricingStrategy pricingStrategy = strategyMgr.determinePricingStrategy(metaData);
        DriverMatchingStrategy driverMatchingStrategy = strategyMgr.determineMatchingStrategy(metaData);

        Driver driver = driverMatchingStrategy.matchDriver(metaData);
        double tripPrice = pricingStrategy.calculate(metaData);

        Trip trip = new Trip(rider, driver, srcLoc, dstLoc, tripPrice, pricingStrategy, driverMatchingStrategy);
        int tripId = trip.getTripId();
        tripsInfo.put(tripId,trip);
        tripsMetaDataInfo.put(tripId,metaData);
    }

    Map<Integer, Trip> getTripsMap() {
        return tripsInfo;
    }
}
