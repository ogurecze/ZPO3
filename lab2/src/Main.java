public class Main {
    public static void main(String[] args) {
        // Losowy odbiorca i reklama
        Recipient recipient = new Recipient();
        recipient.setEmail("example@example.com");
        recipient.setPhoneNumber("123456789");
        recipient.setPreferredLanguage("es");

        Ad ad = new Ad();
        ad.setContent("Buy one, get one free!");

        // Kwota zapłacona przez reklamodawcę
        double paymentAmount = 6000;

        // Główna klasa zarządzająca
        AdManager adManager = new AdManager();

        // Wysłanie reklamy
        adManager.sendAd(recipient, ad, paymentAmount);
    }
}