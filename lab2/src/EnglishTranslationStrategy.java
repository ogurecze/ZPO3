public class EnglishTranslationStrategy implements TranslationStrategy {
    @Override
    public String translate(String adContent) {
        return "Translated to English: " + adContent;
    }
}