public class SMSDeliveryStrategy implements AdDeliveryStrategy {
    @Override
    public void sendAd(Recipient recipient, String adContent) {
        System.out.println("Sending SMS to " + recipient.getPhoneNumber() + " with content: " + adContent);
    }
}