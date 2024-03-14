public class Viewer {
    private Translator translator;

    public Viewer(Translator translator) {
        this.translator = translator;
    }

    public Translator getLanguage() {
        return translator;
    }
}
