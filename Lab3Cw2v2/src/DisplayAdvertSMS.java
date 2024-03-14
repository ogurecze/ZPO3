public class DisplayAdvertSMS implements DisplayAdvert{
    @Override
    public void display(String advert) {
        System.out.println("sent by SMS: " + advert);
    }
}
