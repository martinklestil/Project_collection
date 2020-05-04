package model;

import java.util.ArrayList;
import java.util.List;

public class Feed {

    private String title;
    private String link;
    private String description;
    private String lastBuildDate;

    private final List<FeedMessage> entries = new ArrayList<FeedMessage>();

    public Feed(String title, String link, String description, String lastBuildDate) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.lastBuildDate = lastBuildDate;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getLastBuildDate() {
        return lastBuildDate;
    }

    public List<FeedMessage> getEntries() {
        return entries;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", lastBuildDate='" + lastBuildDate + '\'' +
                ", entries=" + entries +
                '}';
    }
}
