import java.util.Map;

public class DriverManager {
    private static volatile DriverManager DriverManager;
    private Map<String, Driver> driverMap;
    private DriverManager() {}

    public static DriverManager getDriverManager() {
        if(DriverManager == null) {
            synchronized (DriverManager.class) {
                if(DriverManager == null) {
                    DriverManager = new DriverManager();
                }
            }
        }
        return DriverManager;
    }

    public void addDriver(String name, Driver driver) {
        driverMap.put(name, driver);
    }

    public Driver getDriver(String name) {
        return driverMap.get(name);
    }

    public Map<String, Driver> getDriverMap() {
        return driverMap;
    }
}
