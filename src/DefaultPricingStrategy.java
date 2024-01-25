public class DefaultPricingStrategy implements PricingStrategy {
    public double calculate(TripMetadata tripMetadata) {
        System.out.println("Based on default strategy price is 100" );
        return 100.0;
    }
}
