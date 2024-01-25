public class StrategyManager {
    private static volatile StrategyManager strategyManager;

    private StrategyManager() {}

    public static StrategyManager getStrategyManager() {
        if(strategyManager == null) {
            synchronized (StrategyManager.class) {
                if(strategyManager == null) {
                    strategyManager = new StrategyManager();
                }
            }
        }

        return strategyManager;
    }

    public PricingStrategy determinePricingStrategy(TripMetadata tripMetadata) {
        System.out.println("Based on the srcloc, destloc and riders rating returning pricing strategy");
        return new RatingBasedPricingStrategy();
    }

    public DriverMatchingStrategy determineMatchingStrategy(TripMetadata tripMetadata) {
        System.out.println("Based on the srcloc, destloc and drivers rating returning pricing strategy");
        return new LeastTimeBasedMatchingStrategy();
    }
}
