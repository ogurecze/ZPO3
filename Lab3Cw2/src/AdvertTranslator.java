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
                return "Bpnjour! " + advert;
            }
            default: {
                return advert;
            }
        }
    }
}
