public class DisplayAdvertEmail implements DisplayAdvert{
    @Override
    public void display(String advert) {
        System.out.println("sent by email: " + advert);
    }
}
