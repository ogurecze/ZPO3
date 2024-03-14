public class TranslateSpanish implements Translator{
    @Override
    public String translate(String advert) {
        return ("¡" + advert + "!");
    }
}
