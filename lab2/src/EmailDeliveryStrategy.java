public class EmailDeliveryStrategy implements AdDeliveryStrategy {
    @Override
    public void sendAd(Recipient recipient, String adContent) {
        System.out.println("Sending email to " + recipient.getEmail() + " with content: " + adContent);
    }
}