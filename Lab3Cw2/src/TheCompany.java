public class TheCompany {
    private AdvertTranslator advertTranslator;
    private DisplayAdvert displayAdvert;

    public TheCompany(AdvertTranslator advertTranslator, DisplayAdvert displayAdvert) {
        this.advertTranslator = advertTranslator;
        this.displayAdvert = displayAdvert;
    }

    public void distributeAdvert(String advert, String viewerLanguage, double payment) {
        String translatedAdvert = advertTranslator.translate(advert, viewerLanguage);

        if (payment >= 50) {
            displayAdvert = new DisplayAdvertSpeech();
        } else if (payment >= 20) {
            displayAdvert = new DisplayAdvertSMS();
        } else {
            displayAdvert = new DisplayAdvertEmail();
        }

        displayAdvert.display(translatedAdvert);
    }
}
