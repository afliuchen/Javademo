package UML;

public class NytIMES implements Observer {

    @Override
    public void notify(String tweet) {
        if(tweet!=null && tweet.contains("money")){
            System.out.println("Breaking news in NY!"+tweet);
        }
    }
}
