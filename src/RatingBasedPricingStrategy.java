public class RatingBasedPricingStrategy implements PricingStrategy {
        public  double calculate(TripMetadata pTripMetadata) {
            double price = Util.isHighRating(pTripMetadata.getRiderRating()) ? 55.0 : 65.0;
            System.out.println("Based on " + Util.ratingToString(pTripMetadata.getRiderRating()) +
                    " rider rating, price of the trip is " + price);
            return price;
        }
}
