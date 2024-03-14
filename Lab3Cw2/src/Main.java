import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> languages = List.of("English", "Spanish", "French");
        List<String> adverts = List.of("New movie release!", "Special offer - 50% off!", "Limited time discount!");

        TheCompany company = new TheCompany(new AdvertTranslator(), new DisplayAdvertEmail());
        
        Random random = new Random();
        String wiewerLanguange = languages.get(random.nextInt(languages.size()));
        String advert = adverts.get(random.nextInt(adverts.size()));
        double payment = random.nextDouble() * 70;

        company.distributeAdvert(advert, wiewerLanguange, payment);
    }
}