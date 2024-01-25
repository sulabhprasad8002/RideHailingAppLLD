public interface PricingStrategy {
    abstract double calculate(TripMetadata tripMetadata);
}
