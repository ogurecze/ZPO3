public interface AdDeliveryStrategy {
    void sendAd(Recipient recipient, String adContent);
}