public class TripMetadata {
    Location srcLoc;
    Location dstLoc;
    RATING riderRating;
    RATING driverRating;

    public TripMetadata(Location srcLoc, Location dstLoc, RATING riderRating) {
        this.srcLoc = srcLoc;
        this.dstLoc = dstLoc;
        this.riderRating = riderRating;
        this.driverRating = null;
    }

    public void setDriverRating(RATING driverRating) {
        this.driverRating = driverRating;
    }

    public RATING getDriverRating() {
        return driverRating;
    }

    public RATING getRiderRating() {
        return riderRating;
    }
}
