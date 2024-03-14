public class AdvertTranslator implements Translator{
    @Override
    public String translate(String advert, String language) {
        switch (language) {
            case "English": {
                return advert;
            }
            case "Spanish": {
                return "¡" + advert + "!";
            }
            case "French": {
                return "Bonjour! " + advert;
            }
            default: {
                return advert;
            }
        }
    }
}
