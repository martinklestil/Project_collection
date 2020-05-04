import model.Feed;
import model.FeedMessage;
import model.RSSFeedParser;

public class Main {


    public static void main(String[] args) throws Exception {
        RSSFeedParser parser = new RSSFeedParser("https://www.roteskreuz.at/berichten/rss/blutspendetermine/");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        for(FeedMessage message : feed.getEntries()){
            System.out.println(message);
        }
    }
}
