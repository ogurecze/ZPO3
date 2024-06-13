public class SpanishTranslationStrategy implements TranslationStrategy {
    @Override
    public String translate(String adContent) {
        return "Traducido al Español: " + adContent;
    }
}