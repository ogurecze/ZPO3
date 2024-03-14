import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //List<String> languages = List.of("English", "Spanish", "French");
        List<String> adverts = List.of("New movie release!", "Special offer - 50% off!", "Limited time discount!");

        TheCompany company = new TheCompany(new AdvertTranslator(), new DisplayAdvertEmail());

        List<Viewer> viewers = new ArrayList<>();
        viewers.add(new Viewer("English"));
        viewers.add(new Viewer("Spanish"));
        viewers.add(new Viewer("French"));

        Random random = new Random();
        String advert = adverts.get(random.nextInt(adverts.size()));
        double payment = random.nextDouble() * 70;
        Viewer viewer = viewers.get(random.nextInt(viewers.size()));

        company.distributeAdvert(advert, viewer.getLanguage(), payment);
    }
}