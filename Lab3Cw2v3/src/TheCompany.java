public class TheCompany {

    private DisplayAdvert displayAdvert;

    public TheCompany(DisplayAdvert displayAdvert) {
        this.displayAdvert = displayAdvert;
    }

    public void distributeAdvert(String advert, Translator translator, double payment) {
        String translatedAdvert = translator.translate(advert);

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
