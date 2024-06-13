public class VoiceDeliveryStrategy implements AdDeliveryStrategy {
    @Override
    public void sendAd(Recipient recipient, String adContent) {
        System.out.println("Sending voice message to " + recipient.getPhoneNumber() + " with content: " + adContent);
        // Kod do syntezatora mowy tutaj
    }
}