public class AdManager {

    public void sendAd(Recipient recipient, Ad ad, double paymentAmount) {
        TranslationStrategy translationStrategy = selectTranslationStrategy(recipient.getPreferredLanguage());
        AdDeliveryStrategy adDeliveryStrategy = selectAdDeliveryStrategy(paymentAmount);

        String translatedContent = translationStrategy.translate(ad.getContent());
        adDeliveryStrategy.sendAd(recipient, translatedContent);
    }

    private TranslationStrategy selectTranslationStrategy(String language) {
        switch (language) {
            case "en":
                return new EnglishTranslationStrategy();
            case "es":
                return new SpanishTranslationStrategy();
            default:
                throw new UnsupportedOperationException("Unsupported language: " + language);
        }
    }

    private AdDeliveryStrategy selectAdDeliveryStrategy(double paymentAmount) {
        if (paymentAmount >= 1000) {
            return new VoiceDeliveryStrategy();
        } else if (paymentAmount >= 500) {
            return new SMSDeliveryStrategy();
        } else {
            return new EmailDeliveryStrategy();
        }
    }
}