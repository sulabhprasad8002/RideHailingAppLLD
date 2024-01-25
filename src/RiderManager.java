import java.util.*;
public class RiderManager {
    private static volatile RiderManager riderManager;
    private Map<String, Rider> riderMap;
    private RiderManager() {}

    public static RiderManager getRiderManager() {
        if(riderManager == null) {
            synchronized (RiderManager.class) {
                if(riderManager == null) {
                    riderManager = new RiderManager();
                }
            }
        }
        return riderManager;
    }

    public void addRider(String name, Rider rider) {
        riderMap.put(name, rider);
    }

    public Rider getRider(String name) {
        return riderMap.get(name);
    }
}
