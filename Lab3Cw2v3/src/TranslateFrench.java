public class TranslateFrench implements Translator{
    @Override
    public String translate(String advert) {
        return ("Bonjour! " + advert);
    }
}
