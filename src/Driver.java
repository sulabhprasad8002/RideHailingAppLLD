public class Driver {
    String name;
    boolean avail;
    RATING rating;
    public Driver(String pName, RATING pRating)  {
        this.name = pName;
        this.rating = pRating;
        avail = false;
    }
    void updateAvail(boolean pAvail) {
        avail = pAvail;
    }
    String getDriverName() {
        return name;
    }
    RATING getRating() {
        return rating;
    }
};