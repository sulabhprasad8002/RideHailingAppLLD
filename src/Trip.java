class Trip {
    Rider rider;
    Driver driver;
    Location srcloc;
    Location dstLoc;
    TRIPSTATUS status;
    int tripId;
    double price;
    PricingStrategy pricingStrategy;
    DriverMatchingStrategy driverMatchingStrategy;
    Trip(Rider pRider, Driver pDriver, Location pSrcLoc, Location pDstLoc, double pPrice,
         PricingStrategy pPricingStrategy, DriverMatchingStrategy pDriverMatchingStrategy) {
        this.rider = pRider;
        this.driver = pDriver;
        this.srcloc = pSrcLoc;
        this.dstLoc = pDstLoc;
        this.price = pPrice;
        this.pricingStrategy = pPricingStrategy;
        this.driverMatchingStrategy = pDriverMatchingStrategy;
        status = TRIPSTATUS.DRIVER_ON_THE_WAY;
        //This is not threadsafe and is just for demo purposes
        tripId = 10;
    }
    int getTripId() {
        return tripId;
    }
    void displayTripDetails() {
        System.out.println("Trip id - " + tripId);
        System.out.println("Rider - " + rider.getRiderName());
        System.out.println("Driver - " + driver.getDriverName());
        System.out.println("Price - " + price);
        System.out.println("Locations - " + srcloc.latitude + "," + srcloc.longitude" and " + dstLoc.latitude+","+dstLoc.longitude);
    }
};