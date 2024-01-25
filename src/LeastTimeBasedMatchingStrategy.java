public class LeastTimeBasedMatchingStrategy implements DriverMatchingStrategy{
        public Driver matchDriver(TripMetadata tripMetadata) {
            DriverManager driverMgr = DriverManager.getDriverManager();

            if ((driverMgr.getDriverMap()).size() == 0) {
                System.out.print("No drivers! What service is this huh?");
            }
            System.out.println("Using quadtree to see nearest cabs, using driver manager to get details of drivers and send notifications");
            Driver driver = driverMgr.getDriverMap().get("first"); //here we can call quadtree algo to get nearest cabs
            System.out.println("Setting " + driver.getDriverName() + " as driver");
            tripMetadata.setDriverRating(driver.getRating());
            return driver;
        }
}
